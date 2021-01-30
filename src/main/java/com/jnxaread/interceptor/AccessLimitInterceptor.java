package com.jnxaread.interceptor;

import com.jnxaread.entity.AccessIPContainer;
import com.jnxaread.entity.UnifiedResult;
import com.jnxaread.status.StatusCodeEnum;
import com.jnxaread.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 访问限制拦截器
 * 对每一次访问的IP进行识别，判断访问IP是否为恶意IP
 * 如果为恶意IP，则加入恶意IP名单进行封禁处理
 *
 * @Author 未央
 * @Create 2021-01-27 22:47
 */
@Component
public class AccessLimitInterceptor implements HandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger("access");

    private static final long SAFE_ACCESS_COUNT = 300;
    private static final long WARN_ACCESS_COUNT = 1500;
    private static final long DANGER_ACCESS_COUNT = 3600;


    private static final double VICIOUS_SECOND_ACCESS_RATE = 15.0;
    private static final double HIGH_SECOND_ACCESS_RATE = 10.0;
    private static final double MID_SECOND_ACCESS_RATE = 8.0;
    private static final double LOW_SECOND_ACCESS_RATE = 5.0;
    private static final double MINUTE_ACCESS_RATE = 3.0;
    private static final double HOUR_ACCESS_RATE = 1.0;

    private static final long HIGH_LIMIT_TIME = 60 * 60 * 1000;
    private static final long MID_LIMIT_TIME = 15 * 60 * 1000;
    private static final long LOW_LIMIT_TIME = 3 * 60 * 1000;

    private static final StatusCodeEnum passCheckForbidden = StatusCodeEnum.PASS_CHECK_FORBIDDEN;
    private static final StatusCodeEnum passCheckLimited = StatusCodeEnum.PASS_CHECK_LIMITED;
    private static final UnifiedResult forbiddenResult = UnifiedResult.build(passCheckForbidden.getCode());
    private static final UnifiedResult limitedResult = UnifiedResult.build(passCheckLimited.getCode());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        AccessIPContainer accessIPContainer = AccessIPContainer.getAccessIpContainer();
        ArrayList<String> viciousIPList = accessIPContainer.getViciousIPList();
        String remoteAddr = request.getRemoteAddr();
        if (viciousIPList.contains(remoteAddr)) {
            ResponseUtil.response(response, forbiddenResult);
            return false;
        }
        ConcurrentHashMap<String, Long> limitedIPMap = accessIPContainer.getLimitedIPMap();
        if (limitedIPMap.containsKey(remoteAddr)) {
            ResponseUtil.response(response, limitedResult);
            return false;
        }

        ConcurrentHashMap<String, long[]> accessIPMap = accessIPContainer.getAccessIPMap();

        long[] accessInfo;
        long currentTime = System.currentTimeMillis();
        if (accessIPMap.containsKey(remoteAddr)) {
            accessInfo = accessIPMap.get(remoteAddr);
            long accessCount = accessInfo[0];

            if (accessCount < SAFE_ACCESS_COUNT) {
                accessInfo[0] = accessCount + 1;
                return true;
            }

            long accessTime = accessInfo[1];
            long intervalTime = currentTime - accessTime;
            double accessRate = (double) accessCount / intervalTime * 1000;

            String accessMsg;
            accessMsg = remoteAddr + "-" + accessCount + "-" + accessTime;
            if (accessCount < WARN_ACCESS_COUNT) {
                if (accessRate > VICIOUS_SECOND_ACCESS_RATE) {
                    viciousIPList.add(remoteAddr);
                    logger.error(accessMsg);
                    ResponseUtil.response(response, forbiddenResult);
                    return false;
                }
                if (accessRate > HIGH_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + HIGH_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + HIGH_LIMIT_TIME);
                    ResponseUtil.response(response, limitedResult);
                    return false;
                }
                if (accessRate > MID_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + MID_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + MID_LIMIT_TIME);
                    ResponseUtil.response(response, limitedResult);
                    return false;
                }
                if (accessRate > LOW_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + LOW_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + LOW_LIMIT_TIME);
                    ResponseUtil.response(response, limitedResult);
                    return false;
                }
            } else if (accessCount < DANGER_ACCESS_COUNT) {
                if (accessRate > MINUTE_ACCESS_RATE) {
                    viciousIPList.add(remoteAddr);
                    logger.error(accessMsg);
                    ResponseUtil.response(response, forbiddenResult);
                    return false;
                }
            } else {
                if (accessRate > HOUR_ACCESS_RATE) {
                    viciousIPList.add(remoteAddr);
                    logger.error(accessMsg);
                    ResponseUtil.response(response, forbiddenResult);
                    return false;
                }
            }
            accessInfo[0] = accessCount + 1;
            return true;
        }

        accessInfo = new long[2];
        accessInfo[0] = 1L;
        accessInfo[1] = currentTime;
        accessIPMap.put(remoteAddr, accessInfo);

        //0.0.0.0.0.1
        logger.info(remoteAddr);

        return true;
    }
}
