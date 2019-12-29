package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnglishController {

    /*
     英文书法教程页面
     */
    @RequestMapping("/english")
    public String english(){
        return "./page/english";
    }

}
