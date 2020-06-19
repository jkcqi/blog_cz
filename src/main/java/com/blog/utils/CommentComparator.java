package com.blog.utils;

import com.blog.pojo.CommentContainer;

import java.util.Comparator;

public class CommentComparator implements Comparator<CommentContainer> {
    @Override
    public int compare(CommentContainer o1, CommentContainer o2) {
        return o1.getCommenttime().compareTo(o2.getCommenttime())>=0?-1:1;
    }
}
