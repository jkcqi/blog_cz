package com.blog.service.impl;

import com.blog.mapper.TagMapper;
import com.blog.pojo.Tag;
import com.blog.pojo.TagExample;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> selectTagByArticleID(Integer id) {
        return tagMapper.selectTagByArticleID(id);
    }

    @Override
    public List<Tag> selectTags() {
        TagExample tagExample = new TagExample();
        TagExample.Criteria criteria = tagExample.createCriteria();
        criteria.andTagnameNotLike("0");
        return tagMapper.selectByExample(tagExample);
    }
}
