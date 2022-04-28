package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Emp;
import com.atguigu.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping("/emp/{id}")
    @ResponseBody
    public Emp selectEmpById(@PathVariable("id") String id){
        Emp emp = empService.selectEmpById(id);
        return emp;
    }

    @PostMapping("/emp")
    @ResponseBody
    public Emp addEmp(Emp emp){
        empService.insertEmp(emp);
        return emp;
    }
}
