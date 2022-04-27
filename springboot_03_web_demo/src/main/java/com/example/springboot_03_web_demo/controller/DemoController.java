package com.example.springboot_03_web_demo.controller;

import com.example.springboot_03_web_demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class DemoController {


    //在地址栏输入/或/login 跳转到登录页
    @GetMapping(value = {"/","login"})
    public String index(){
        //System.out.println("进入index方法");
        return "login";
    }

    //处理登录逻辑
    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){
        if (!StringUtils.isEmpty(user.getUsername())&&"789123".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            //重定向到main请求
            return "redirect:main";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            //System.out.println("用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping("/main")
    public String main(HttpSession session, Model model){
        //System.out.println("main请求----------");
        //判断用户是否登录 没有登陆返回登录页面
//        if (session.getAttribute("loginUser")!=null){
//            return "main";
//        }else {
//            model.addAttribute("msg","请重新登陆");
//            return "login";
//        }
        //return "main";
        return "main";
    }
}
