package com.gzeh.forum.util.web;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {

	private static final int SUCCESS = 0;
	private static final int FAIL = 500;

	public R() {
		put("code",SUCCESS);
	}
	
	public static R error() {
		return error(FAIL, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(FAIL, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = R.ok();
		r.put("msg", msg);
		return r;
	}
	public static R ok(Map map) {
		R r = R.ok();
		r.putAll(map);
		return r;
	}

	public static R ok() {
		R r = new R();
		r.put("msg","操作成功");
		return r;
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public R data(Object data) {
		if (data == null) {
			data = new JSONObject();
		}
		super.put("data", data);
		return this;
	}
}