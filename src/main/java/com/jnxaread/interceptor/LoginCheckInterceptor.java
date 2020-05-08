package com.jnxaread.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.jnxaread.bean.User;
import com.jnxaread.entity.UnifiedResult;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

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
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            PrintWriter writer = null;
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            try {
                writer = response.getWriter();
                UnifiedResult result = UnifiedResult.build(400, "您还未登录，请登录", null);
                writer.print(JSONObject.toJSONString(result));
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (writer != null)
                    writer.close();
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
