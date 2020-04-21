package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 硬笔书法模块
 */
@Controller
public class HardPenController {

    @RequestMapping("/hardpen")
    public String hardPen(){
        return "hardpen";
    }

}
