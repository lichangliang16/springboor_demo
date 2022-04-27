package com.example.springboot_03_web_demo.controller;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.HeaderFault;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class FormController {

    @GetMapping("/form_layouts")
    public String form_layouts(){

        return "/form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email")String email,
                         @RequestParam("username")String name,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos")MultipartFile[] files) throws IOException {

        log.info("email={},name={},headerImg.size={},files.length={}",email,name, headerImg.getSize(),files.length);

        if (headerImg!=null){
            String name1 = headerImg.getName();
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D://test//"+originalFilename));
            System.out.println("headerImg.getName"+name1);
            System.out.println("headerImg.originalFilename"+originalFilename);
        }

        if (files.length>0){
            for (MultipartFile file : files){
                String originalFilename = file.getOriginalFilename();
                file.transferTo(new File("D://test//"+originalFilename));
            }
        }

        return "/main";
    }
}
