package com.blog.pojo;

import java.io.Serializable;

public class Tag implements Serializable {
    private Integer tagid;

    private String tagname;

    private String tagcontext;

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public String getTagcontext() {
        return tagcontext;
    }

    public void setTagcontext(String tagcontext) {
        this.tagcontext = tagcontext == null ? null : tagcontext.trim();
    }
}