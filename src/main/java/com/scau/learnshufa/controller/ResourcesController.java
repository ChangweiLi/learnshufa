package com.scau.learnshufa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 书法学习平台的资源管理模块
 */
@Controller
public class ResourcesController {

    @GetMapping("/resources")
    public String resources(){
        return "resources";
    }

    @RequestMapping("/newresource")
    public String newResource(){
        return "newresource";
    }

    @RequestMapping("/resources/submitresources")
    public String  oneFileUpload(HttpServletRequest request){
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        return "";
    }


}
