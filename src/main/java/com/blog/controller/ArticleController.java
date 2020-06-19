package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.pojo.ArticleContainer;
import com.blog.pojo.User;
import com.blog.service.ArticleService;
import com.blog.service.UserService;
import com.blog.utils.ArticleComparator;
import com.blog.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/info")
    @ResponseBody
    public Map<String, Object> selectArticleInfo() {
        List<Article> articles = articleService.selectArticleInfo();
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("artInfo", articles);
        return R.ok(hashMap);
    }

    @RequestMapping("/articlesbyid")
    @ResponseBody
    public Map<String, Object> selectArticle(Integer id) {
        ArticleContainer articleContainer = articleService.selectArtConByID(id);
        articleContainer.setUsername(articleContainer.getUser().getUsername());
        return R.ok().put("articles", articleContainer);
    }

    @RequestMapping("/insart")
    @ResponseBody
    public Map<String, Object> insertArtcile(@RequestBody Map<String, Object> requestBody) {
        String content = (String) requestBody.get("content");
        String title = (String) requestBody.get("title");
        String ab = (String) requestBody.get("brief");
        String username = (String) requestBody.get("username");
        User user = userService.getUserByUsername(username);
        Article article = new Article();
        article.setArticleBoid(user.getId());
        article.setArticletitle(title);
        article.setArticleabstract(ab);
        article.setAriticlecontext(content);
        article.setCreatetime(Timestamp.valueOf(dateFormat.format(new Date())));
        articleService.insertArticle(article);
        return R.ok();
    }

}
