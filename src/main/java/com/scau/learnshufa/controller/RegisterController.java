package com.scau.learnshufa.controller;


import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * 注册模块控制层
 */
@Controller
public class RegisterController {
    private static Logger logger = Logger.getLogger(String.valueOf(RegisterController.class));

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    /** 添加注册信息 */
    @PostMapping("/register/submit")
    @ResponseBody
    public String submit(HttpServletRequest request){
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            User user = new User();
            user.setUserName(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setUserAlias(request.getParameter("alias"));
            user.setEmail(request.getParameter("email"));
            user.setBirthday(request.getParameter("birthday"));
            user.setPhone(request.getParameter("phone"));
            user.setRegisterData(simpleDateFormat.format(date));
            userMapper.insertSelective(user);
            logger.info("用户:"+user.getUserName()+"注册成功");
            return "OK";
        }
      catch (Exception e){
            return"用户注册失败";
      }

    }

}
