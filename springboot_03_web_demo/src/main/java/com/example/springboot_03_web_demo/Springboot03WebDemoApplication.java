package com.example.springboot_03_web_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot03WebDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot03WebDemoApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanName:beanDefinitionNames){
//            System.out.println(beanName);
//        }
    }

}
