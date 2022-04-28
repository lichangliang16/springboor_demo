package com.example.springboot_03_web_demo;

import com.example.springboot_03_web_demo.bean.User;
import com.example.springboot_03_web_demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DempApplicationTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public void test1(){
        User user = userMapper.selectById(1L);
       // userMapper.se;
        System.out.println(user);
    }
}
