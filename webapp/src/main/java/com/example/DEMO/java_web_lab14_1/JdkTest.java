package com.example.DEMO.java_web_lab14_1;

public class JdkTest{
	public static void main(String[] args) {
		// 创建代理对象，代理角色一般会有一些附属操作
		JdkProxy jdkProxy = new JdkProxy();
         // 创建目标对象，真实角色
		UserDao userDao= new UserDaoImpl();
		System.out.println("------增强前-------");
		userDao.addUser();
		userDao.deleteUser();
		// 获取增强后的目标对象
		System.out.println("------增强后-------");
		// 从代理对象中获取增强后的目标对象，这就是动态生成的，代理角色
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		// 执行方法
		userDao1.addUser();
		userDao1.deleteUser();
	}
}
