package com.scau.learnshufa.controller;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;
import com.scau.learnshufa.utils.LayuiJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@Controller
//@RequestMapping("")
public class BackendController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/backend")
    public String getHome() {
        return "backend";
    }

//    显示用户页
    @RequestMapping("/backend/showusers")
    public String showUsers(){
        return "page/showusers";
    }

//    @RequestMapping("/backend/getusers")
//    public String getUsers(){
//        return
//    }

    @RequestMapping("/backend/articles")
    public String showArticles(){
        return "";
    }

    @RequestMapping("/backend/getusers")
    @ResponseBody
    public String getAllUsers(){
        List<User> userList = userMapper.findAllUser();
        Logger.getLogger(String.valueOf(userList.get(0).getUserId()));
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String s = objectMapper.writeValueAsString(userList);
            LayuiJson json = new LayuiJson(String.valueOf(userList.size()),s);
            return json.toString();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "error";
        }
    }


    @RequestMapping("/backend/s")
    public String showResources(){
        return "";

    }
    @RequestMapping("/backend/newarticle")
    public String newArtile(){
        return "page/newarticle";
    }

}
