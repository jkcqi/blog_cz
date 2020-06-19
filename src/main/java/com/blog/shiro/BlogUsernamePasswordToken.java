package com.blog.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

public class BlogUsernamePasswordToken extends UsernamePasswordToken {

    private String role;

    public BlogUsernamePasswordToken(String username, String password, String role) {
        super(username, password);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
