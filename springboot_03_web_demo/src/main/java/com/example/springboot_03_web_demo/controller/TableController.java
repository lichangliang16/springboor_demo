package com.example.springboot_03_web_demo.controller;

import com.example.springboot_03_web_demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {

    @RequestMapping("/basic_table")
    public String basic_table(){
        //int a = 6/0;
        return "/table/basic_table";
    }

    @RequestMapping("/dynamic_table")
    public String dynamic_table(Model model){

        List<User> users = new ArrayList<User>();
        users.add(new User("licl","789123"));
        users.add(new User("a","14"));
        users.add(new User("b","214"));
        users.add(new User("c","124214"));
        users.add(new User("d","46"));

        model.addAttribute("users",users);
        return "/table/dynamic_table";
    }

    @RequestMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }

    @RequestMapping("/pricing_table")
    public String pricing_table(){
        return "/table/pricing_table";
    }

    @RequestMapping("/responsive_table")
    public String responive_table(){
        return "/table/responsive_table";
    }
}
