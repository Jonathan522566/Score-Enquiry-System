package com.example.DEMO.java_web_lab15_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 测试类
public class TestXmlAspectj {
	public static void main(String args[]) {
		ApplicationContext context =
                          new ClassPathXmlApplicationContext("aspectjBeans.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		userDao.addUser();
		userDao.deleteUser();
	}
}
