package com.blog.utils;

import com.blog.pojo.Article;
import com.blog.pojo.ArticleContainer;

import java.util.Comparator;

public class ArticleComparator implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return o1.getId().compareTo(o2.getId())>=0?-1:1;
    }
}
