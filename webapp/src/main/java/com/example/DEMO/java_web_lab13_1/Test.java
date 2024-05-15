package com.example.DEMO.java_web_lab13_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_java_web_lab13_1.xml");
        CollegeStudent stu=context.getBean("student",CollegeStudent.class);
        //name是collegeStudent在beans.xml中的id
        System.out.println(stu);
    }

}
