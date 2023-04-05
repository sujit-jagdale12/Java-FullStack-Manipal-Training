package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/home")
    public String getUser(){
        return "user";
    }

    @GetMapping("/page")
    public String demoPage(){
        return "demo";
    }
}
