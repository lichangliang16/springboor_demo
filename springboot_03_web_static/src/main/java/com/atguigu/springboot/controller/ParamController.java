package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParamController {

    @RequestMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") String id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> propMap,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") String age,
                                     @RequestParam("inters") List<String> interests,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("Idea-900951a0") String cookievalue,
                                     @CookieValue("Idea-900951a0") Cookie cookie

    ){
        Map<String,Object> map= new HashMap<>();
        map.put("id",id);
        map.put("username",username);
        //map.put("pv",propMap);
        map.put("user-agent",userAgent);
       // map.put("header",header);
        map.put("age",age);
        map.put("interests",interests);
        map.put("params",params);
       // map.put("Idea-900951a0",cookievalue);
        map.put("cookievalue",cookie.getValue());
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }

    @PostMapping("/saveuser")
    @ResponseBody
    public Person saveUser(Person person){
        return person;
    }
}
