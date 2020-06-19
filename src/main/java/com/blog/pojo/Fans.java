package com.blog.pojo;

import java.io.Serializable;

public class Fans implements Serializable {
    private Integer id;

    private Integer fanid;

    private Integer boid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFanid() {
        return fanid;
    }

    public void setFanid(Integer fanid) {
        this.fanid = fanid;
    }

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }
}