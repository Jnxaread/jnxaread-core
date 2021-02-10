package com.jnxaread.interceptor;

import com.jnxaread.entity.UnifiedResult;
import com.jnxaread.util.ResponseUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 解决跨域访问问题
 *
 * @author 未央
 * @create 2020-05-02 20:03
 */
@Component
public class AccessOriginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String terminal = request.getHeader("User-Agent");
        if (terminal == null) {
            ResponseUtil.response(response, UnifiedResult.build("402", "参数错误", null));
            return false;
        }
        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP），允许所有ip访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
        // 允许携带cookie跨域
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
