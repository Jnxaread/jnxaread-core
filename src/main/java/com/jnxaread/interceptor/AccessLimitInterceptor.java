package com.jnxaread.interceptor;

import com.jnxaread.entity.AccessIPContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author 未央
 * @Create 2021-01-27 22:47
 */
@Component
public class AccessLimitInterceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger("access");

    private static long SAFE_ACCESS_COUNT = 300;
    private static long WARN_ACCESS_COUNT = 1500;
    private static long DANGER_ACCESS_COUNT = 3600;


    private static double VICIOUS_SECOND_ACCESS_RATE = 15.0;
    private static double HIGH_SECOND_ACCESS_RATE = 10.0;
    private static double MID_SECOND_ACCESS_RATE = 8.0;
    private static double LOW_SECOND_ACCESS_RATE = 5.0;
    private static double MINUTE_ACCESS_RATE = 3.0;
    private static double HOUR_ACCESS_RATE = 1.0;

    private static long HIGH_LIMIT_TIME = 60 * 60 * 1000;
    private static long MID_LIMIT_TIME = 15 * 60 * 1000;
    private static long LOW_LIMIT_TIME = 3 * 60 * 1000;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        AccessIPContainer accessIPContainer = AccessIPContainer.getAccessIpContainer();
        ArrayList<String> viciousIPList = accessIPContainer.getViciousIPList();
        String remoteAddr = request.getRemoteAddr();
        if (viciousIPList.contains(remoteAddr)) {
            return false;
        }
        ConcurrentHashMap<String, Long> limitedIPMap = accessIPContainer.getLimitedIPMap();
        if (limitedIPMap.containsKey(remoteAddr)) {
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
                    return false;
                }
                if (accessRate > HIGH_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + HIGH_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + HIGH_LIMIT_TIME);
                    return false;
                }
                if (accessRate > MID_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + MID_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + MID_LIMIT_TIME);
                    return false;
                }
                if (accessRate > LOW_SECOND_ACCESS_RATE) {
                    limitedIPMap.put(remoteAddr, currentTime + LOW_LIMIT_TIME);
                    logger.warn(accessMsg + "-" + LOW_LIMIT_TIME);
                    return false;
                }
            } else if (accessCount < DANGER_ACCESS_COUNT) {
                if (accessRate > MINUTE_ACCESS_RATE) {
                    viciousIPList.add(remoteAddr);
                    logger.error(accessMsg);
                    return false;
                }
            } else {
                if (accessRate > HOUR_ACCESS_RATE) {
                    viciousIPList.add(remoteAddr);
                    logger.error(accessMsg);
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

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
