package com.blog.service;

import com.blog.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    List<User> selectUserByusername(String username);
    void insertUser(User user);
    User selectUserByEmail(String email);
    PageInfo<User> selectUsers(Integer curpage);
    String updateUserPassword(User user);
    String deleteUserByID(User user);
    User getUserByUsername(String username);
    User selectUserByID(Integer id);
    List<User> selectUserLikeUsername(String username);

}
