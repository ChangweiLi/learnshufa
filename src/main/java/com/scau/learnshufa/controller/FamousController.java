package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名人书法模块
 */
@Controller
public class FamousController {


    /*
    名人书法欣赏
     */
    @RequestMapping("/famous")
    public String famous(){
        return "famous";
    }
}
