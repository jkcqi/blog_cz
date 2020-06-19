package com.blog.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {

    private static final String EMAIL_Regx1="[a-zA-Z0-9_]*@[a-zA-Z0-9]+[.][a-zA-Z0-9]+";
    private static final String EMAIL_Regx2="[a-zA-Z0-9_]*@[a-zA-Z0-9]+[.][a-zA-Z0-9]+[.][a-zA-Z0-9]+";

    public static boolean isEmail(String username){
        Pattern pattern = Pattern.compile(EMAIL_Regx1);
        Matcher matcher = pattern.matcher(username);
        Pattern pattern1 = Pattern.compile(EMAIL_Regx2);
        Matcher matcher1 = pattern1.matcher(username);
        if (matcher.matches()||matcher1.matches()){
            return true;
        }else {
            return false;
        }
    }

}
