package com.blog.service.impl;

import com.blog.mapper.ArticleMapper;
import com.blog.mapper.UserMapper;
import com.blog.pojo.Article;
import com.blog.pojo.ArticleContainer;
import com.blog.pojo.ArticleExample;
import com.blog.service.ArticleService;
import com.blog.utils.ArticleComparator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> selectArticleInfo() {
        List<Article> articles = articleMapper.selectArticleInfo();
        articles.sort(new ArticleComparator());
        return articles;
    }

    @Override
    public Article selectArticleByID(Integer id) {
        ArticleContainer articleContainer = articleMapper.selectArticleByID(id);
        articleContainer.setUsername(articleContainer.getUser().getUsername());
        Article article=articleContainer;
        return article;
    }

    @Override
    public Article selectArticleInfoByID(Integer id) {
        return articleMapper.selectArticleInfoByID(id);
    }

    @Override
    public PageInfo<Article> selectArticleList(Integer curpage) {
        PageHelper.startPage(curpage,5);
        List<Article> articles = articleMapper.selectArticleInfo();
        PageInfo<Article> articlePageInfo = new PageInfo<>(articles);
        return articlePageInfo;
    }

    @Override
    public List<Article> selectArticleByUsername(String username) {
        List<Article> articles = articleMapper.selectArticleByUsername(username);
        return articles;
    }

    @Override
    public void insertArticle(Article article) {
        articleMapper.insertSelective(article);
    }

    @Override
    public ArticleContainer selectArtConByID(Integer id) {
        return articleMapper.selectArticleByID(id);
    }
}
