package com.blog.pojo;

import java.io.Serializable;

public class Category implements Serializable {
    private Integer id;

    private String categoryname;

    private String categorycontext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getCategorycontext() {
        return categorycontext;
    }

    public void setCategorycontext(String categorycontext) {
        this.categorycontext = categorycontext == null ? null : categorycontext.trim();
    }
}