package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WritingBrushController {

    @RequestMapping("/writingbrush")
    public String brush(){
        return "./page/writingbrush";
    }
}
