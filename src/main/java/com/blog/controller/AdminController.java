package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.pojo.Log;
import com.blog.pojo.User;
import com.blog.service.ArticleService;
import com.blog.service.LogService;
import com.blog.service.UserService;
import com.blog.utils.R;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private ArticleService articleService;
    @Autowired
    private LogService logService;

    @RequestMapping("/seleuser")
    @ResponseBody
    public Map<String, Object> getUserByUsername(String username) {
        List<User> users = userService.selectUserLikeUsername(username);
        Map<String, Object> map = new HashMap<>();
        map.put("usersele", users);
        return R.ok(map);
    }

    @RequestMapping("/upuspass")
    @ResponseBody
    public Map<String, Object> updateUserPassword(@RequestBody Map<String, Object> requestBody) {
        User user = new User();
        user.setUsername((String) requestBody.get("username"));
        user.setPassword((String) requestBody.get("password"));
        userService.updateUserPassword(user);
        return R.ok();
    }

    @RequestMapping("/userlist")
    @ResponseBody
    public Map<String, Object> getUsers(Integer curpage) {
        PageInfo<User> userPageInfo = userService.selectUsers(curpage);
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("pagesize", userPageInfo.getPageSize());
        hashMap.put("total", userPageInfo.getTotal());
        hashMap.put("totalpage", userPageInfo.getPages());
        hashMap.put("curpage", userPageInfo.getPageNum());
        hashMap.put("userlist", userPageInfo.getList());
        return R.ok(hashMap);
    }

    @RequestMapping("/deleusbyid")
    @ResponseBody
    public Map<String, Object> deleteUser(@RequestBody Map<String, Integer> requestbody) {
        User user = new User();
        System.out.println(requestbody.get("id"));
        user.setId(requestbody.get("id"));
        userService.deleteUserByID(user);
        return R.ok();

    }

    @RequestMapping("/artlist")
    @ResponseBody
    public Map<String, Object> getArticls(Integer curpage) {
        PageInfo<Article> pageInfo = articleService.selectArticleList(curpage);
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("pagesize", pageInfo.getPageSize());
        hashMap.put("total", pageInfo.getTotal());
        hashMap.put("totalpage", pageInfo.getPages());
        hashMap.put("curpage", pageInfo.getPageNum());
        hashMap.put("articlelist", pageInfo.getList());
        return R.ok(hashMap);
    }

    @RequestMapping("/finartbyun")
    @ResponseBody
    public Map<String, Object> findAricleByUsername(String username) {
        List<Article> articles = articleService.selectArticleByUsername(username);
        Map<String, Object> map = new HashMap<>();
        map.put("articlelist", articles);
        return R.ok(map);
    }

    @RequestMapping("/loglist")
    @ResponseBody
    public Map<String,Object> getLogs(){
        List<Log> logs = logService.selectLogs();
        Map<String,Object> map=new HashMap<>();
        map.put("loglist",logs);
        return R.ok(map);
    }

}
