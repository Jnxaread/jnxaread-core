package com.jnxaread.util;

import com.alibaba.fastjson.JSONObject;
import com.jnxaread.entity.UnifiedResult;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 拦截器响应工具类
 *
 * @author 未央
 * @create 2020-06-16 18:18
 */
public class ResponseUtil {
    public static void response(HttpServletResponse response, UnifiedResult result) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(JSONObject.toJSONString(result));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}
