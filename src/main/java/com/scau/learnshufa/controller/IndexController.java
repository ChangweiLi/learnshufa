package com.scau.learnshufa.controller;


import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index() {
        return "redirect:index";
    }


    @RequestMapping("/users")
    public List<User> getAllUsers() {
        List<User> userList = userMapper.findAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        System.out.println(userList.get(0));
        Logger.getLogger(String.valueOf(userList.get(0).getUserId()));
        return userList;
    }


}
