package com.example.DEMO.java_web_lab5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionTestServlet",value = "/SessionTestServlet")
public class SessionTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String str=request.getParameter("do");
        HttpSession session=request.getSession();
        response.getWriter().println(str);
        if (str.equals("add")){
            session.setAttribute("attr","testsession");
        }else if(str.equals("del")){
            session.removeAttribute("attr");
        }else if (str.equals("modi")){
            session.setAttribute("attr","123456");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
























