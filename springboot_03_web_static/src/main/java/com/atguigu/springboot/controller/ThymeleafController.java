package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/hellothy")
    public String helloThy(Model model){

        model.addAttribute("msg","message");
        model.addAttribute("link","http://www.baidu.com");
        return "hellothy";
    }
}
