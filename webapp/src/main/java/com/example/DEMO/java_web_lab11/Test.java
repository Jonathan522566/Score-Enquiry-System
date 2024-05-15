package com.example.DEMO.java_web_lab11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //把配置文件resoure的beans中（变量值），进行初始化
        ApplicationContext context=
                new ClassPathXmlApplicationContext("beans_java_web_lab13_1.xml");

        //getBean函数的作用是获得dbDao在bean文件的id（里面含有初始化值）
        //获得完id换句话来说-将beea文件中的初始化-赋值到里面
        DbDao dbDao=(DbDao)context.getBean("dbDao");
        System.out.println(dbDao.DbOpration());

        StudentDao studentDao=context.getBean(StudentDao.class);
        System.out.println(studentDao.toString());
    }
}
