package com.controller;

import com.dao.UserDao;

public class ListProductController {

	UserDao userDao;

	public ListProductController(UserDao ud) {
		System.out.println("ListProductController....created....");
		this.userDao = ud;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
