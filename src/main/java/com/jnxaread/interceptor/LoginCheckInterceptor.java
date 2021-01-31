package com.jnxaread.interceptor;

import com.jnxaread.bean.User;
import com.jnxaread.constant.StatusCodeEnum;
import com.jnxaread.entity.UnifiedResult;
import com.jnxaread.util.ResponseUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录校验拦截器
 * 拦截所有的发布请求
 *
 * @author 未央
 * @create 2020-05-08 10:13
 */
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        User admin = (User) session.getAttribute("admin");
        if (user == null && admin == null) {
            StatusCodeEnum status = StatusCodeEnum.NOT_LOGGED_IN;
            ResponseUtil.response(response, UnifiedResult.build(status.getCode(), status.getDescribe(), null));
            return false;
        }
        return true;
    }
}
