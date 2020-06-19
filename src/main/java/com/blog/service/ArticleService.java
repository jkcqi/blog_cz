package com.blog.service;

import com.blog.pojo.Article;
import com.blog.pojo.ArticleContainer;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ArticleService {

    List<Article> selectArticleInfo();
    Article selectArticleByID(Integer id);
    Article selectArticleInfoByID(Integer id);
    PageInfo<Article> selectArticleList(Integer curpage);
    List<Article> selectArticleByUsername(String username);
    void insertArticle(Article article);
    ArticleContainer selectArtConByID(Integer id);

}
