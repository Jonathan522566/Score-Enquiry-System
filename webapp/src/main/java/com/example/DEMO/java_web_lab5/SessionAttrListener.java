package com.example.DEMO.java_web_lab5;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttrListener implements HttpSessionAttributeListener {
    public SessionAttrListener(){}

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session add attr.....");

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session remove attr....");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session modi attr....");
    }
}
