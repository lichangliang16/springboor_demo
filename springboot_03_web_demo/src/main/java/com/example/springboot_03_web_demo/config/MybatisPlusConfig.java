package com.example.springboot_03_web_demo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    /**
     *   mybatis-plus分页插件配置 解决返回的total和pages一直为0的问题
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType("mysql");
        return page;
    }
}