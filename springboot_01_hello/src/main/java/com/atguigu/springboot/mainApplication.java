package com.atguigu.springboot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.springboot.bean.Pet;
import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.config.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class mainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(mainApplication.class, args);
//        BeanConfig beanConfig = run.getBean("beanConfig", BeanConfig.class);
//        System.out.println(beanConfig);

//        //User user02 = run.getBean("user01", User.class);
//        Pet pet1 = user01.getPet();
//        Pet pet  = run.getBean("pet", Pet.class);
//
//        System.out.println(user01);
//        System.out.println(pet1);
//        System.out.println(pet);
       // System.out.println(pet==pet1);

//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        System.out.println("-----------");
//        DBHelper bean = run.getBean(DBHelper.class);
//        System.out.println(bean);
//        User user01 = run.getBean("user01", User.class);
//        System.out.println(user01);
//        Pet pet = run.getBean("pet", Pet.class);
//        boolean haha = run.containsBean("haha");
//        System.out.println(haha);
//        boolean car = run.containsBean("car");
//        System.out.println(car);
    }
}
