package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 毛笔书法模块
 */
@Controller
public class WritingBrushController {

    @RequestMapping("/writingbrush")
    public String brush(){
        return "writingbrush";
    }
}
