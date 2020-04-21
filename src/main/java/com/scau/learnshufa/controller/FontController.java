package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 书法字体模块
 */
@Controller
public class FontController {

    /*
根据字体来筛选或者查询教程
 */
    @RequestMapping("/font")
    public String font(){
        return "font";
    }
}
