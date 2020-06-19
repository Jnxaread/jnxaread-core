package com.jnxaread.config;

import com.jnxaread.interceptor.AccessOriginInterceptor;
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

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessOriginInterceptor).addPathPatterns("/**");
    }
}
