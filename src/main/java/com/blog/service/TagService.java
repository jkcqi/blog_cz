package com.blog.service;

import com.blog.pojo.Tag;

import java.util.List;

public interface TagService {

    List<Tag> selectTagByArticleID(Integer id);
    List<Tag> selectTags();

}
