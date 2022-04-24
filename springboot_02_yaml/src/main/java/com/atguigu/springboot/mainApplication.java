package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class mainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(mainApplication.class, args);
    }
}
