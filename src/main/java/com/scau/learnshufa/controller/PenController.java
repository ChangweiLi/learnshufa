package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 钢笔书法模块
 */
@Controller
public class PenController {

    /*
   钢笔书法欣赏
    */
    @RequestMapping("/pen")
    public String famous(){
        return "pen";
    }
}
