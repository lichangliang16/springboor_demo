package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot04AccessdataApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot04AccessdataApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String name :beanDefinitionNames){
//            System.out.println(name);
//        }
    }

}
