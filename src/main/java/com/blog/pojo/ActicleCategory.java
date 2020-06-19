package com.blog.pojo;

import java.io.Serializable;

public class ActicleCategory implements Serializable {
    private Integer categoryid;

    private Integer articleid;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }
}