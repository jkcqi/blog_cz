package com.blog.utils;

import com.blog.pojo.Article;
import com.blog.pojo.Log;
import com.blog.pojo.User;
import com.blog.service.ArticleService;
import com.blog.service.CommentService;
import com.blog.service.LogService;
import com.blog.service.UserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Aspect
public class LogAspect {

    public Integer id=null;

    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private LogService logService;
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Pointcut("execution(* com.blog.service.impl.*.selectUserByusername(..))")
    public void loginExecution(){}

    @Pointcut("execution(* com.blog.service.impl.*.insertComment(..))")
    public void insertCommentExecution(){}

    @Pointcut("execution(* com.blog.service.impl.UserServiceImpl.updateUserPassword(..))")
    public void updateExeuction(){}

    @Pointcut("execution(* com.blog.service.impl.*.deleteUserByID(..))")
    public void deleteExeuction(){}

    @Pointcut("execution(* com.blog.service.impl.ArticleServiceImpl.insertArticle(..))")
    public void insertArticleExeuction(){}

    @AfterReturning(value = "insertArticleExeuction()",argNames = "joinPoint,object",returning = "object")
    public void insertArticleLog(JoinPoint joinPoint,Object object){
        User user = userService.selectUserByID(id);
        Log log = new Log();
        log.setUsername(user.getUsername());
        log.setAction("发表了新博文");
        log.setAcTime(Timestamp.valueOf(dateFormat.format(new Date())));
        logService.insertLog(log);
    }

    @AfterReturning(value = "loginExecution()",argNames = "joinPoint,object",returning = "object" )
    public void loginLog(JoinPoint joinPoint,Object object){
        List<User> users= (List<User>) object;
        User user = users.get(0);
        Log log = new Log();
        log.setUsername(user.getUsername());
        log.setAction("登录");
        log.setAcTime(Timestamp.valueOf(dateFormat.format(new Date())));
        id=user.getId();
        System.out.println(id);
        logService.insertLog(log);
    }

    @AfterReturning(value = "insertCommentExecution()",argNames = "joinPoint,object",returning = "object")
    public void insertCommentLog(JoinPoint joinPoint,Object object){
        User user = userService.selectUserByID(id);
        Log log = new Log();
        log.setUsername(user.getUsername());
        User user1 = userService.selectUserByID((Integer) object);
        log.setAction("评论了用户"+user1.getUsername()+"的文章");
        log.setAcTime(Timestamp.valueOf(dateFormat.format(new Date())));
        logService.insertLog(log);
    }

    @AfterReturning(value = "updateExeuction()",argNames = "joinPoint,object",returning = "object")
    public void updateLog(JoinPoint joinPoint,Object object){
        String username= (String) object;
        User user = userService.selectUserByID(id);
        Log log = new Log();
        log.setUsername(user.getUsername());
        log.setAction("管理员"+user.getUsername()+"修改了用户"+username+"的密码");
        log.setAcTime(Timestamp.valueOf(dateFormat.format(new Date())));
        logService.insertLog(log);
    }

    @AfterReturning(value = "deleteExeuction()",argNames = "joinPoint,object",returning = "object")
    public void deleteLog(JoinPoint joinPoint,Object object){
        User admin=userService.selectUserByID(id);
        Log log = new Log();
        log.setUsername(admin.getUsername());
        log.setAction("管理员"+admin.getUsername()+"删除了用户"+(String) object);
        log.setAcTime(Timestamp.valueOf(dateFormat.format(new Date())));
        logService.insertLog(log);
    }

}
