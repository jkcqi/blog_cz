package com.blog.utils;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.ext.IBM037;

import java.util.Map;

@ControllerAdvice
public class ExceptionUtil {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handleException(Exception e){
        return R.error("未知异常请联系管理员");
    }


}
