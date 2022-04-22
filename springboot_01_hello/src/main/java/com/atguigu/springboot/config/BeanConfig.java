package com.atguigu.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.springboot.bean.Pet;
import com.atguigu.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = true)
//@Import({User.class, DBHelper.class})

public class BeanConfig {

    @Bean("user01")
    public User user01(){
        User user = new User("zhangsan", "22");
        user.setPet(pet1());
        return user;
    }

    @Bean("pet")
    public Pet pet1(){
        return new Pet("jack");
    }
}
