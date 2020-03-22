package com.scau.learnshufa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    /** 添加注册信息 */
    @PostMapping("/register/submit")
    public String submit(){
        if(true){  // 验证信息如果正确则添加到用户
            return "login";
        }
        else{ // 否则返回注册页面
            return "register";
        }
    }

}
