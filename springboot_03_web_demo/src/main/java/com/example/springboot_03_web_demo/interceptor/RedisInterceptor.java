package com.example.springboot_03_web_demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 访问量拦截器
 * 把用户访问页面的数量存入redis
 * key-请求路径 value-数量
 *
 */
@Component
public class RedisInterceptor implements HandlerInterceptor {

    @Autowired
    StringRedisTemplate redisTemplate;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        ValueOperations<String, String> options = redisTemplate.opsForValue();
        options.increment(requestURI);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
