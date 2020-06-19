package com.blog.service;

import com.blog.pojo.Comment;
import com.blog.pojo.CommentContainer;

import java.util.List;

public interface CommentService {

    List<CommentContainer> selectCommentByArticleID(Integer id);
    Integer insertComment(Comment comment);

}
