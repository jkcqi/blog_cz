package com.blog.pojo;

import java.io.Serializable;

public class ArticleTag implements Serializable {
    private Integer articleid;

    private Integer tagid;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }
}