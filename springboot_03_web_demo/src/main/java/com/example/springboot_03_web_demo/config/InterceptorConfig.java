package com.example.springboot_03_web_demo.config;

import com.example.springboot_03_web_demo.interceptor.MainInterceptor;
import com.example.springboot_03_web_demo.interceptor.RedisInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig  implements WebMvcConfigurer {

    @Autowired
    RedisInterceptor redisInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new MainInterceptor())
       .addPathPatterns("/**")
       .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**","/error");

        registry.addInterceptor(redisInterceptor)
                .addPathPatterns("/**");
    }

}
