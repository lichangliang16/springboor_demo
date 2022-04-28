package com.example.springboot_03_web_demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String id;
    private String name;
    private String age;
    private String email;

    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String password;
}
