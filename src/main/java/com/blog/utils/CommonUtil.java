package com.blog.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Map;

public class CommonUtil {

    public static final String SALT="zkx";
    private static final int hashIterations=10;
    private static final String hashAlgorithmName="md5";

    public static Map<String,Object> validErrors(BindingResult bindingResult){
        StringBuilder builder = null;
        if (bindingResult.hasErrors()){
            builder=new StringBuilder();
            for (FieldError error : bindingResult.getFieldErrors()) {
                builder.append(error.getDefaultMessage());
            }
        }
        if (builder != null){
            return R.error(builder.toString());
        }else {
            return R.ok();
        }
    }

    public static String getCredentials(String password){
        return String.valueOf(new SimpleHash(hashAlgorithmName,password,SALT,hashIterations));
    }

}
