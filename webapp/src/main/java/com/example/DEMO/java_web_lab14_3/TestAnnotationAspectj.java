package com.example.DEMO.java_web_lab14_3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// 测试类
public class TestAnnotationAspectj {
	public static void main(String args[]) {
		ApplicationContext context =
                 new ClassPathXmlApplicationContext("aspecjanobeans.xml");
		// 1 从spring容器获得内容
		UserDao userDao = (UserDao) context.getBean("userDao");
		// 2 执行方法
		userDao.addUser();
	}
}
