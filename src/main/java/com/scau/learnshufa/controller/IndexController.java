package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/shufa")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("this is index");
        return "index";
    }

    /*
    英文书法教程页面
     */
    @RequestMapping("/index/english")
    public String english(){
        return "english";
    }

    /*
    名人书法欣赏
     */
    @RequestMapping("/index/famous")
    public String famous(){
        return "famous";
    }

    /*
    根据字体来筛选或者查询教程
     */
    @RequestMapping("/index/font")
    public String font(){
        return "font";
    }




}
