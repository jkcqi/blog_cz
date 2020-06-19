package com.blog.utils;

import com.blog.pojo.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getId().compareTo(o2.getId())>0?1:-1;
    }
}
