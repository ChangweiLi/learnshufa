package com.scau.learnshufa.controller;


import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * 登陆模快
 */
@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(String.valueOf(LoginController.class));

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
    public String loginCheck(@PathVariable String id) {
        System.out.println(id);
        return "redirect:/index";
//        return "redirect:/login";
    }

    /**
     * 登陆表单提交
     * 1、验证码验证
     * 2、账户验证
     * @param username
     * @param pwd
     * @param tryCode
     * @return
     */
    @RequestMapping(value = "/login/submit", method = POST)
    @ResponseBody
    public String login_submit(HttpServletRequest request,HttpServletResponse response) {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        User user = userMapper.selectByUsername(username);
        if(user != null){
            String usernameDB = user.getUserName();
            String pwdDB = user.getPassword();
            if (username.equals(usernameDB) && (pwd.equals(pwdDB))) {
                logger.info("用户《" + username + "》登陆成功......");
                System.out.println("密码->"+pwd);
                return "OK";
            } else {
                logger.info("登陆名为《" + username + "》登陆失败......");
                return "PWDError";
            }
        }else {
            return "USERError";
        }
    }

    /**
     * 3、校对检查验证码
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     */
//    @RequestMapping(value = "/login/submit", method = POST)
//    public ModelAndView imgvrifyControllerDefaultKaptcha(@RequestParam String username, @RequestParam String pwd,@RequestParam String tryCode) {
//        ModelAndView andView = new ModelAndView();
//        String rightCode = (String) httpServletRequest.getSession().getAttribute("rightCode");
//        String tryCode = httpServletRequest.getParameter("tryCode");
//        System.out.println("rightCode:"+rightCode+" ———— tryCode:"+tryCode);
//        if (!rightCode.equals(tryCode)) {
//            andView.addObject("info", "错误的验证码");
//            andView.setViewName("index");
//        } else {
//            andView.addObject("info", "登录成功");
//            andView.setViewName("success");
//        }
//        return andView;
//    }
}
