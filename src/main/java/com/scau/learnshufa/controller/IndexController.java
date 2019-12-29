package com.scau.learnshufa.controller;


import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index(){
        return "index";
    }





    @RequestMapping("/users")
    public String getAllUsers(Model model){
        List<User> userList = userMapper.findAllUser();
//        ModelAn modelAndView = new ModelAndView();
//        modelAndView.addObject("userList", userList);
        model.addAttribute("userList",userList);
        return "users";
    }

    @RequestMapping("/test")
//    public ModelAndView test(){
//        ModelAndView modelAndView = new ModelAndView("test");
//        modelAndView.addObject("name","李长伟");
//        return modelAndView;
//    }
   public String test(Map<Object,Object> map){
        map.put("name","张三");
        return "test.ftl";
    }

}
