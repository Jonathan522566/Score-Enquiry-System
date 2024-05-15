package com.example.DEMO.java_web_lab14_2;

// 测试类
public class CglibTest {
	public static void main(String[] args) {
		// 创建代理对象
		CglibProxy cglibProxy = new CglibProxy();
		// 创建目标对象
		UserDao userDao = new UserDao();
		System.out.println("------增强前-------");
		userDao.addUser();
		userDao.deleteUser();
         // 获取增强后的目标对象
		System.out.println("------增强后-------");
		UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
		// 执行方法
		userDao1.addUser();
		userDao1.deleteUser();
	}
}
