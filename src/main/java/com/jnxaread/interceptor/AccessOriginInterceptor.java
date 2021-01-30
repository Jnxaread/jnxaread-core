package com.jnxaread.interceptor;

import com.jnxaread.entity.UnifiedResult;
import com.jnxaread.util.ResponseUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 未央
 * @create 2020-05-02 20:03
 */
@Component
public class AccessOriginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse rep, Object o) throws Exception {
        String terminal = req.getHeader("User-Agent");
        if (terminal == null) {
            ResponseUtil.response(rep, UnifiedResult.build("402", "参数错误", null));
            return false;
        }
        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP），允许所有ip访问
        rep.setHeader("Access-Control-Allow-Origin", req.getHeader("origin"));
        // 允许携带cookie跨域
        rep.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
