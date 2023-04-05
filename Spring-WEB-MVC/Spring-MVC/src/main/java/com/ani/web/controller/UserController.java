package com.ani.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ani.web.entity.User;

@Controller
public class UserController {
    
    @GetMapping("/")
    public String openForm(){
        return "form";
    }

    @PostMapping("/loginform")
    public ModelAndView createUser(@ModelAttribute("user") User user) {
    
        ModelAndView mv=new ModelAndView("show");
        mv.addObject("id", user.getId());
        mv.addObject("name", user.getName());
        mv.addObject("email", user.getEmail());
        mv.addObject("mobile", user.getMobile());
        return mv;
    }

}
