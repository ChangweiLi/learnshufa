package com.scau.learnshufa.controller;

import com.scau.learnshufa.entity.Article;
import com.scau.learnshufa.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 英语书法模块
 */
@Controller
public class EnglishController {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 英文书法教程页面
     */
    @RequestMapping("/english")
    public ModelAndView english() {
        /** 加载主英语语法模块页面的各种信息*/
        ModelAndView modelAndView = new ModelAndView();
        List<Article> mostPopularArticles = articleMapper.selectMostPopularEightEnglishArticles();
        List<Article> lastestArticles = articleMapper.selectLatestTenEnglishArticles();
        modelAndView.addObject("mostPopularArticles", mostPopularArticles);
        modelAndView.addObject("lastestArticles", lastestArticles);
        modelAndView.setViewName("english");
        return modelAndView;
    }

    /**
     * 根据id显示英文书法教程单个文章页面
     */
    @RequestMapping("/english/{id}")
    public ModelAndView englishArticle(@PathVariable Long id) {
        /** 加载主英语语法模块页面的各种信息*/
        ModelAndView modelAndView = new ModelAndView();
        Article article = articleMapper.selectByPrimaryKey(id);
        modelAndView.addObject("article", article);
        modelAndView.setViewName("article");
        return modelAndView;
    }


}
