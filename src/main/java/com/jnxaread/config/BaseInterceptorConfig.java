package com.jnxaread.config;

import com.jnxaread.interceptor.AccessOriginInterceptor;
import com.jnxaread.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 未央
 * @create 2020-05-02 20:16
 */
@Configuration
public class BaseInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private AccessOriginInterceptor accessOriginInterceptor;

    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    private String[] loginCheckPath = {
            "/**/new/**", //所有的创建作品的路径
            "/**/own", //所有的请求自己的作品的路径
            "/**/edit/**", //所有的编辑或修改路径
            "/**/brief/chapter", //获取章节简要信息的路径
    };

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessOriginInterceptor).addPathPatterns("/**");
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns(loginCheckPath);
    }
}