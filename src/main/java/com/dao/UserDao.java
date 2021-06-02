package com.dao;

public class UserDao {

	UserDao(){
		System.out.println("userDao created....default");
	}
	String userName;

	public  UserDao(String userName){
			this.userName  = userName;
			System.out.println("userDao created....para");

	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	


}
