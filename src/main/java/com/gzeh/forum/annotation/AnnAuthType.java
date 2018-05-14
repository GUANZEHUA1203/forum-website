package com.gzeh.forum.annotation;

public enum AnnAuthType {
	anon("anon"),//不验证
	session("session"),//验证session
	sessionAndAuthc("sessionAndAuthc");//验证session和访问权限
	
	private  String name;
	
	
	AnnAuthType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
