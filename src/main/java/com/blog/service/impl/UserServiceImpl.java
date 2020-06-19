package com.blog.service.impl;

import com.blog.mapper.UserMapper;
import com.blog.pojo.User;
import com.blog.pojo.UserExample;
import com.blog.service.UserService;
import com.blog.utils.CommonUtil;
import com.blog.utils.UserComparator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserByusername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public void insertUser(User user) {
        user.setPassword(CommonUtil.getCredentials(user.getPassword()));
        userMapper.insertSelective(user);
    }

    @Override
    public User selectUserByEmail(String email) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andEmailEqualTo(email);
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }

    @Override
    public PageInfo<User> selectUsers(Integer curpage) {
        PageHelper.startPage(curpage,5);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameNotEqualTo("sysadmin");
        List<User> users = userMapper.selectByExample(userExample);
        users.sort(new UserComparator());
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }

    @Override
    public String updateUserPassword(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        User user1 = new User();
        user1.setPassword(CommonUtil.getCredentials(user.getPassword()));
        userMapper.updateByExampleSelective(user1,userExample);
        return user.getUsername();
    }

    @Override
    public String deleteUserByID(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(user.getId());
        User user1 = userMapper.selectByExample(userExample).get(0);
        userMapper.deleteUser(user);
        return user1.getUsername();
    }

    @Override
    public User getUserByUsername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public User selectUserByID(Integer id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public List<User> selectUserLikeUsername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameLike(username);
        return userMapper.selectByExample(userExample);
    }
}
