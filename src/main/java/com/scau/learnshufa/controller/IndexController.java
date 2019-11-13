package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/home")
//@RequestMapping("/shufa")
public class IndexController {

    @GetMapping("/index")
    public String index1(){
        return "index";
    }

    /*
    英文书法教程页面
     */
    @RequestMapping("/english")
    public String english(){
        return "english";
    }

    /*
    名人书法欣赏
     */
    @RequestMapping("/famous")
    public String famous(){
        return "famous";
    }

    /*
    根据字体来筛选或者查询教程
     */
    @RequestMapping("/font")
    public String font(){
        return "font";
    }




}
