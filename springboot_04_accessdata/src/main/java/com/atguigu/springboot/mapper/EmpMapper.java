package com.atguigu.springboot.mapper;

import com.atguigu.springboot.bean.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmpMapper {

    @Select("select * from t_emp where eid = #{id}")
    Emp selectEmpById(String id);

    @Insert("insert into t_emp(emp_name,age,sex,email) values(#{empName},#{age},#{sex},#{email})")
    @Options(useGeneratedKeys = true,keyProperty = "eid")
    void insertEmp(Emp emp);
}
