package com.example.springboot_03_web_demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_03_web_demo.bean.User;
import com.example.springboot_03_web_demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
