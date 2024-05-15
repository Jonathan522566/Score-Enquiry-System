package com.example.DEMO.java_web_lab5;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "ContextTestServlet",value = "/ContextTestServlet")
public class ContextTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str=request.getParameter("do");
        ServletContext context=this.getServletContext();
        response.getWriter().println(str);

        if (str.equals("add")){
            context.setAttribute("test","testcontest");
            context.setAttribute("test2","abcdefghijk");
        }else if (str.equals("del")){
            context.removeAttribute("test");
        }else if(str.equals("rep")){
            context.setAttribute("test2","123456");
        }
    }
}
