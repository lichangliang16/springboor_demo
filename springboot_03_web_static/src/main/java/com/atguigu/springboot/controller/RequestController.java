package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @RequestMapping("/goto")
    public String Goto(HttpServletRequest request){
        request.setAttribute("name","licl");
        request.setAttribute("password","789123");

        return "forward:/success";
    }

    @RequestMapping("/success")
    @ResponseBody
    public Map<String,String> success(@RequestAttribute(value = "name")String name,
                                      @RequestAttribute(value = "password")String password,
                                      HttpServletRequest request){

        Map<String,String> map = new HashMap<>();
        map.put("string_name",name);
        map.put("string_password",password);
        map.put("map_name", (String) request.getAttribute("name"));

        return map;
    }
}
