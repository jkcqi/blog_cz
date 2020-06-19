package com.blog.service.impl;

import com.blog.mapper.CategoryMapper;
import com.blog.pojo.Category;
import com.blog.pojo.CategoryExample;
import com.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectCategoryByArticleID(Integer id) {
        return categoryMapper.selectCategoryByArticleID(id);
    }

    @Override
    public List<Category> selectCategory() {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andCategorynameNotLike("0");
        return categoryMapper.selectByExample(categoryExample);
    }
}
