package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HardPenController {

    @RequestMapping("/hardpen")
    public String hardPen(){
        return "./page/hardpen";
    }

}
