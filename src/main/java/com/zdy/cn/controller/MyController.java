package com.zdy.cn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("my")
    public String my(){
        return "my";
    }
}
