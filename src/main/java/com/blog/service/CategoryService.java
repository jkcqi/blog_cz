package com.blog.service;

import com.blog.pojo.Category;

import java.util.List;

public interface CategoryService {

    List<Category> selectCategoryByArticleID(Integer id);
    List<Category> selectCategory();

}
