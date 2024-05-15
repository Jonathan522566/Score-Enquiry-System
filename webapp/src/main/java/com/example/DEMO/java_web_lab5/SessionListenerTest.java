package com.example.DEMO.java_web_lab5;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListenerTest implements HttpSessionListener {
   static int activeSessions;
   public SessionListenerTest(){}

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        activeSessions++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        activeSessions++;
    }

    public static int getActiveSessions() {
        return activeSessions;
    }
}
