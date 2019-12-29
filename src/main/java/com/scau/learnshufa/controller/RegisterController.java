package com.scau.learnshufa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @GetMapping("")
    public String register(){
        return "./page/register";
    }

    @PostMapping("/add")
    public String Success(){
        if(true){
            return "login";
        }
        else{
            return "./page/register";
        }
    }

}
