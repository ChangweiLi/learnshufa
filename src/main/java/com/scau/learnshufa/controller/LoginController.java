package com.scau.learnshufa.controller;


import com.scau.learnshufa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录页请求的返回
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 带着用户ID的登录页面
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/login/{id}", method = GET)
    @ResponseBody
    public String loginCheck(@PathVariable String id) {
        System.out.println(id);
        return "redict:/login/" + id;
    }

    @RequestMapping(value = "/login/submit", method = POST)
    public String login_submit(@RequestParam String username, @RequestParam String pwd) {
        System.out.println("username = " + username + ",pwd = " + pwd);
        return "index";
    }
}
