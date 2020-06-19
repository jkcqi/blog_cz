package com.blog.controller;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.shiro.BlogUsernamePasswordToken;
import com.blog.utils.CommonUtil;
import com.blog.utils.PatternUtil;
import com.blog.utils.R;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody User user){
        System.out.println(user);
        user.setRoleid(userService.getUserByUsername(user.getUsername()).getRoleid());
        System.out.println(user);
        BlogUsernamePasswordToken token=null;
        if (user.getRoleid() == 1){
            token=new BlogUsernamePasswordToken(user.getUsername(),user.getPassword(),"user");
        }else if (user.getRoleid() == 2){
            token=new BlogUsernamePasswordToken(user.getUsername(),user.getPassword(),"admin");
        }
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        }catch (IncorrectCredentialsException e2){
            return R.error("密码不正确");
        }catch (Exception e){
            return R.error("未知错误，请联系管理员");
        }
        Session session = subject.getSession();
        User user1 = userService.getUserByUsername(user.getUsername());
        session.setAttribute("username",user1.getUsername());
        return R.ok(user1);
    }

    @RequestMapping("/register")
    @ResponseBody
    public Map<String,Object> regist(@RequestBody Map<String,Object> requestBody){
        String username= (String) requestBody.get("username");
        String email= (String) requestBody.get("email");
        String nicename = (String) requestBody.get("nicename");
        String credentials = CommonUtil.getCredentials((String) requestBody.get("password"));
        User user = new User();
        user.setUsername(username);
        user.setNickname(nicename);
        user.setEmail(email);
        user.setPassword(credentials);
        System.out.println(user);
        List<User> user1 = userService.selectUserByusername(user.getUsername());
        System.out.println(credentials);
        if (user1.size() == 0){
            user.setRoleid(1);
            user.setRegistertime(Timestamp.valueOf(dateFormat.format(new Date())));
            System.out.println(user.getPassword());
            userService.insertUser(user);
            return R.ok("注册成功");
        }else {

            return R.error("用户已存在");
        }
    }



//    @RequestMapping("/demo")
//    @ResponseBody
//    public Map<String,Object> demo(){
//        User user = userService.selectUserByusername("zkx");
//        Map<String, Object> map = new HashMap<>();
//        map.put("msg","登录成功");
//        map.put("username",user.getUsername());
//        map.put("email",user.getEmail());
//        map.put("nickname",user.getNickname());
//        map.put("id",user.getId());
//        return R.ok(map);
//    }

}
