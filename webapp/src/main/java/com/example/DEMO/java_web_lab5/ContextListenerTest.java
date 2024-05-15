package com.example.DEMO.java_web_lab5;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerTest
        implements ServletContextListener, ServletContextAttributeListener {
    public void ContextListenerText(){}

    //初始化
    @Override
    public void contextInitialized(ServletContextEvent sce) { System.out.println("context初始化...."); }

    //销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) { System.out.println("context销毁...."); }

    //添加属性
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("context添加属性.....");
        System.out.println(event.getName());
    }

    //移除属性
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("conetext移除属性.....");
        System.out.println(event.getName());
    }

    //替换属性
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("context替换属性.....");
        System.out.println(event.getName());
    }
}
