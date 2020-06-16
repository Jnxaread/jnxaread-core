package com.jnxaread.interceptor;

import com.jnxaread.bean.User;
import com.jnxaread.entity.UnifiedResult;
import com.jnxaread.util.ResponseUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 未央
 * @create 2020-06-16 18:10
 */
@Component
public class LevelCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String levelStr = request.getParameter("level");
        if (levelStr == null) ResponseUtil.response(response, UnifiedResult.build(400, "参数错误", null));
        Integer level = Integer.valueOf(levelStr);
        if (level < 0 || level > 5) {
            ResponseUtil.response(response, UnifiedResult.build(400, "参数错误", null));
        }
        if (level > 0) {
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");
            if (user == null || !user.getLevel().equals(level)) {
                ResponseUtil.response(response, UnifiedResult.build(400, "参数错误", null));
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
