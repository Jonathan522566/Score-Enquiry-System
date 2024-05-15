package com.example.DEMO.java_web_lab13_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_java_web_lab13_2.xml");
        Person person = (Person) context.getBean("person1");

        System.out.println("主人以及宠物信息:");
        System.out.println("\t名字:" + person.getpName());
        System.out.println("-----------------------------------------");

        System.out.println("Dog:");
        System.out.println("\t名字:" + person.getDog().getName());
        System.out.println("\t年龄:" + person.getDog().getAge());
        person.getDog().feed();
        person.getDog().shout();
        System.out.println("-----------------------------------------");

        System.out.println("Cat:");
        System.out.println("\t名字:" + person.getCat().getName());
        System.out.println("\t年龄:" + person.getCat().getAge());
        person.getCat().feed();
        person.getCat().shout();
        System.out.println("-----------------------------------------");
    }
}