package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;
import com.controller.ListProductController;
import com.controller.SignupController;
import com.dao.UserDao;
import com.util.DbConnection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();

		// System.out.println(context);
//		SignupController abc = (SignupController) context.getBean("sgp");
//		SignupController def = context.getBean("sgp", SignupController.class);
//
//		System.out.println(abc);
//		System.out.println(def);

//		DbConnection db = context.getBean("connection", DbConnection.class);
//
//		System.out.println(db.getUrl());
//		System.out.println(db.getUserName());
//		System.out.println(db.getPassword());
//
//		UserDao userDao = context.getBean("userDao", UserDao.class);
//	
//		System.out.println(userDao.getUserName());

//		DbConnection db1 = context.getBean("connection", DbConnection.class);
//		DbConnection db2 = context.getBean("connection", DbConnection.class);
//
//		System.out.println(db1);
//		System.out.println(db2);

//		ListProductController pc = context.getBean("listProductController",ListProductController.class);
//		System.out.println(pc);
//		System.out.println(pc.getUserDao());
//		
		
		UserBean userBean =  context.getBean("userBean",UserBean.class);
		
		System.out.println(userBean.getFirstName());
		System.out.println(userBean.getUserDetail().getCity());
		
		
	
	}
}
