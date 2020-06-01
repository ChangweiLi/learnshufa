package com.scau.learnshufa.controller;

import com.scau.learnshufa.entity.*;
import com.scau.learnshufa.mapper.ArticleMapper;
import com.scau.learnshufa.mapper.QuestionMapper;
import com.scau.learnshufa.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 学习问答模块
 * @author lichangwei
 * @desc 用于书法爱好者有什么疑问，然后众多人可以回答的
 *
 */
@Controller
public class LearnQAController {

    private static Logger logger = Logger.getLogger(LearnQAController.class.getName());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 显示学习讨论区问题页面
     */
    @RequestMapping("/learnqa")
    public ModelAndView learnQA() {
        /** 加载学习问答模块页面的各种信息*/
        ModelAndView modelAndView = new ModelAndView();
        List<Question> questions = questionMapper.selectAll();
        modelAndView.addObject("questions",questions);
        modelAndView.setViewName("learnqa");
        return modelAndView;
    }

    /**
     * 根据id显示具体问题页面
     */
    @RequestMapping("/learnqa/{id}")
    public ModelAndView learnQAbyId(@PathVariable Long id) {
        /** 加载英语语法模块页面的各种信息*/
        ModelAndView modelAndView = new ModelAndView();
        Question question = questionMapper.selectByPrimaryKey(id);
        modelAndView.addObject("question",question);
        modelAndView.setViewName("qa");
        return modelAndView;
    }



    /**
     * 返回单个发布问答页面
     * @return
     */
    @RequestMapping("newqa")
    public ModelAndView newArticle(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("newqa");
        return modelAndView;
    }



    /**
     * 发布问题
     * @return
     */
    @RequestMapping("submitqa")
    @ResponseBody
    public String submitQA(HttpServletRequest request){
        if(request == null){
            return "ERROR";
        }
        else {
//            Article article = new Article();
//            article.setName(request.getParameter("title"));
//            article.setText(request.getParameter("text"));
//            article.setTopic(request.getParameter("type"));
//            article.setSort(request.getParameter("module"));
//            article.setPublishTime(LocalDateTime.now().toString());
//            article.setReadnum(0);
//            article.setLikes(0);
//            article.setAuthor("admin");
//            articleMapper.insertSelective(article);
            Question question = new Question();
            question.setName(request.getParameter("title"));
            question.setText(request.getParameter("comment"));
            question.setPublishTime(LocalDateTime.now().toString());
            question.setComment(0);
            question.setReadnum(0);
            question.setLikes(0);
            questionMapper.insertSelective(question);
            logger.warning("时间--》》"+question.getPublishTime()+"--《《保存问题"+question.getName()+"成功");
            return "OK";
        }
    }

}
