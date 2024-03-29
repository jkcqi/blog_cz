package com.blog.utils;

import com.blog.pojo.User;
import com.mysql.cj.x.protobuf.Mysqlx;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public R() {
		put("code", "0");
	}
	
	public static R error() {
		return error("500", "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error("500", msg);
	}
	
	public static R error(String code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}
	public static R error(Map<String, Object> map) {
		R r = new R();
		r.put("code", "500");
		r.putAll(map);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}

	
	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public static R ok(User user){
		R r = new R();
		HashMap<String, Object> map = new HashMap<>();
		map.put("msg","登录成功");
		map.put("username",user.getUsername());
		map.put("email",user.getEmail());
		map.put("nickname",user.getNickname());
		map.put("id",user.getId());
		map.put("roleId",user.getRoleid());
		r.putAll(map);
		return r;
	}
}