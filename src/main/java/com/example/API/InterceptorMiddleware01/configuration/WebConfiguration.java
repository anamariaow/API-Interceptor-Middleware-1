package com.example.API.InterceptorMiddleware01.configuration;

import com.example.API.InterceptorMiddleware01.interceptors.APILoggingInterceptor;
import com.example.API.InterceptorMiddleware01.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
