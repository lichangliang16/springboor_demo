package com.example.springboot_03_web_demo.config;

import com.example.springboot_03_web_demo.interceptor.MainInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig  implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new MainInterceptor())
       .addPathPatterns("/**")
       .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**","/error");
    }
}
