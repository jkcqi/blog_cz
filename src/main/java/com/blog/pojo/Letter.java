package com.blog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Letter implements Serializable {
    private Integer id;

    private String lettercomtext;

    private Integer userid;

    private Integer boId;

    private Integer letterstate;

    private Date lettertime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLettercomtext() {
        return lettercomtext;
    }

    public void setLettercomtext(String lettercomtext) {
        this.lettercomtext = lettercomtext == null ? null : lettercomtext.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBoId() {
        return boId;
    }

    public void setBoId(Integer boId) {
        this.boId = boId;
    }

    public Integer getLetterstate() {
        return letterstate;
    }

    public void setLetterstate(Integer letterstate) {
        this.letterstate = letterstate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getLettertime() {
        return lettertime;
    }

    public void setLettertime(Date lettertime) {
        this.lettertime = lettertime;
    }
}