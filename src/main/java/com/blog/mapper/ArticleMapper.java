package com.blog.mapper;

import com.blog.pojo.Article;
import com.blog.pojo.ArticleContainer;
import com.blog.pojo.ArticleExample;
import com.blog.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    List<Article> selectArticleInfo();

    ArticleContainer selectArticleByID(Integer id);

    List<Comment> selectCommentByID(Integer id);

    Article selectArticleInfoByID(Integer id);

    List<Article> selectArticleByUsername(String username);
}