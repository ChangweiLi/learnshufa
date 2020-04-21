package com.scau.learnshufa.controller;


import com.scau.learnshufa.entity.Article;
import com.scau.learnshufa.entity.Module;
import com.scau.learnshufa.entity.Type;
import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Logger;

/**
 * 书法学习平台首页模块
 */
@Controller
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class.getName());

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private TypeMapper typeMapper;
    /**
     * 首页加载所有的文章信息
     * @return
     */
    @RequestMapping("index")
    public ModelAndView index() {
//        从数据库中查询相关文章信息：热门文章、最新文章、各个模快
        List<Article> articles = articleMapper.selectArticles();
        /* 添加最新和最热的文章 */
        List<Article> articles1 = articleMapper.selectLatestSevenArticle();
        List<Article> articles2 = articleMapper.selectMostPopularSevenArticle();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("latestArticles",articles1);
        modelAndView.addObject("mostPopularArticles",articles2);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("newarticle")
    public String newArticle(){
        return "newarticle";
    }


    @RequestMapping("submitarticle")
    @ResponseBody
    public String sumbitArticle(HttpServletRequest request){
        if(request == null){
            return "ERROR";
        }
        else {
            Article article = new Article();
            article.setName(request.getParameter("title"));
            article.setText(request.getParameter("text"));
            article.setPublishTime(LocalDateTime.now().toString());
            article.setReadnum(0);
            article.setLikes(0);
//            article.set
            article.setAuthor("admin");
            articleMapper.insertSelective(article);
            return "OK";
        }
    }

    /**
     * 不用的方法
     * @return
     */
    @RequestMapping("/index/users")
    public List<User> getAllUsers() {
        List<User> userList = userMapper.findAllUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userList);
        System.out.println(userList.get(0));
        Logger.getLogger(String.valueOf(userList.get(0).getUserId()));
        return userList;
    }


    /**
     * 批量造数据填充文章表100条数据、用户表
     *
     */
    @RequestMapping("/index/adddata")
    public String createData(HttpServletRequest request){
        Long id = Long.valueOf(1000);
        String  name = "颜真卿字体书法欣赏";
        String  author = "用户";
        String text = "\n";
        String source_url = request.getContextPath().toString();
//        String
        List<Module> modules = moduleMapper.selectModules();
        List<Type> types =typeMapper.selectTypes();
        ArrayList<String> mudulesArray = new ArrayList<>();
        ArrayList<String> typeArray = new ArrayList<>();
        for(int i = 0; i<modules.size(); i++){
            mudulesArray.add(modules.get(i).getName());
        }
        for(int j = 0; j<types.size();j++){
            typeArray.add(types.get(j).getName());
        }
        for(int i =300; i<500; i++){
            Article article = new Article();
//            article.setId(id+Long.valueOf(1));
//            article.s
            article.setAuthor(author+i);
            article.setName(name+i);
            article.setText(i+text);
//            Topic == modules
            article.setTopic(mudulesArray.get(i%modules.size()));
            article.setSort(typeArray.get(i%types.size()));
            article.setSourceUrl(source_url+"/"+i);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // df.format(new Date())
            article.setPublishTime(df.format(new Date()));
            article.setLikes(new Random().nextInt(1000));
            article.setReadnum(new Random().nextInt(100000));
            articleMapper.insert(article);
        }

        return "index";
    }
}
