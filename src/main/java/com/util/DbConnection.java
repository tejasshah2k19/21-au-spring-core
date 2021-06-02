package com.util;

public class DbConnection {

	String url, userName, password;

	public void myInit() {
		System.out.println("myInit from DbConnection");
	}

	public void myDestroy() {
		System.out.println("myDestroy from DbConnection");

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void getConnection() {
		System.out.println("connection");
	}
}
