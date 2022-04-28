package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Emp;
import com.atguigu.springboot.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpMapper mapper;

    public Emp selectEmpById(String id){
        Emp emp = mapper.selectEmpById(id);
        return emp;
    }

    public void insertEmp(Emp emp){
        mapper.insertEmp(emp);
    };
}
