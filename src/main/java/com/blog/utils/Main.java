package com.blog.utils;

public class Main {

    public static void main(String[] args) {
        String credentials = CommonUtil.getCredentials("123456");
        System.out.println(credentials);
    }

}
