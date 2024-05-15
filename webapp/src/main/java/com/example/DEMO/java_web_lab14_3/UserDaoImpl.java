package com.example.DEMO.java_web_lab14_3;

import org.springframework.stereotype.Repository;

// 目标类，真实对象
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	public void addUser() {
		System.out.println("添加用户");
	}
	public void deleteUser() {
		System.out.println("删除用户");
	}
}
