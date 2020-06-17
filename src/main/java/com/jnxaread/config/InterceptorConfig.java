package com.jnxaread.config;

import com.jnxaread.interceptor.AccessOriginInterceptor;
import com.jnxaread.interceptor.LevelCheckInterceptor;
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
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private AccessOriginInterceptor accessOriginInterceptor;

    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Autowired
    private LevelCheckInterceptor levelCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessOriginInterceptor).addPathPatterns("/**");
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**/new/**","/**/own");
        registry.addInterceptor(levelCheckInterceptor).addPathPatterns("/**/list/**").excludePathPatterns("/**/own");
    }
}
