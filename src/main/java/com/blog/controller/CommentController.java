package com.blog.controller;

import com.blog.pojo.Article;
import com.blog.pojo.Comment;
import com.blog.pojo.CommentContainer;
import com.blog.pojo.User;
import com.blog.service.ArticleService;
import com.blog.service.CommentService;
import com.blog.service.UserService;
import com.blog.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.ext.IBM037;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;
    private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/Comment")
    @ResponseBody
    public Map<String,Object> selectCommentByArticleID(Integer id){
        List<CommentContainer> commentContainers = commentService.selectCommentByArticleID(id);
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("articlecomment",commentContainers);
        return R.ok(hashMap);
    }

    @RequestMapping("/upcom")
    @ResponseBody
    public Map<String,Object> insertComment(@RequestBody Map<String,Object> requestBody){
        String username= (String) requestBody.get("username");
        Integer articleID= (Integer) requestBody.get("article");
        String commentVar= (String) requestBody.get("comment_content");
        Article article = articleService.selectArticleByID(articleID);
        User user = userService.selectUserByusername(username).get(0);
        Comment comment = new Comment();
        comment.setCommentArid(articleID);
        comment.setCommentBoid(article.getArticleBoid());
        comment.setCommentUid(user.getId());
        comment.setCommentcontext(commentVar);
        comment.setCommenttime(Timestamp.valueOf(dateFormat.format(new Date())));
        commentService.insertComment(comment);
        return R.ok();
    }

}
