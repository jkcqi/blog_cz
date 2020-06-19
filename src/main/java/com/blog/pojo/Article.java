package com.blog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Article implements Serializable {
    private Integer id;

    private Integer articleBoid;

    private String articletitle;

    private String articleabstract;

    private String ariticlecontext;

    private Date createtime;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private List<Comment> comment;

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleBoid() {
        return articleBoid;
    }

    public void setArticleBoid(Integer articleBoid) {
        this.articleBoid = articleBoid;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public String getArticleabstract() {
        return articleabstract;
    }

    public void setArticleabstract(String articleabstract) {
        this.articleabstract = articleabstract == null ? null : articleabstract.trim();
    }

    public String getAriticlecontext() {
        return ariticlecontext;
    }

    public void setAriticlecontext(String ariticlecontext) {
        this.ariticlecontext = ariticlecontext == null ? null : ariticlecontext.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}