package com.example.homework3;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration regis=registry.addInterceptor(new DemoInterceptor());
        regis.addPathPatterns("/book","/newbook");
        //regis.excludePathPatterns("/first","/**.png","/**.jpg","/**.jpeg");
    }
}
