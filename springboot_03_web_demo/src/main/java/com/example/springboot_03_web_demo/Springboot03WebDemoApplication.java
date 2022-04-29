package com.example.springboot_03_web_demo;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot03WebDemoApplication {

    public static void main(String[] args) {
      SpringApplication.run(Springboot03WebDemoApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanName:beanDefinitionNames){
//            System.out.println(beanName);
//        }
    }

}
