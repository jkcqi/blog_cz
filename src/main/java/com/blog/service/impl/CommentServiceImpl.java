package com.blog.service.impl;

import com.blog.mapper.CommentMapper;
import com.blog.pojo.Comment;
import com.blog.pojo.CommentContainer;
import com.blog.service.CommentService;
import com.blog.utils.CommentComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<CommentContainer> selectCommentByArticleID(Integer id) {
        List<CommentContainer> commentContainers = commentMapper.selectCommentByArticleID(id);
        commentContainers.sort(new CommentComparator());
        return commentContainers;
    }

    @Override
    public Integer insertComment(Comment comment) {
        commentMapper.insertSelective(comment);
        return comment.getCommentBoid();
    }
}
