package com.example.DEMO.java_web_lab5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplaySessionServlet",value = "/DisplaySessionServlet")
public class DisplaySessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("<h2>现有活动的会话个数:");

        HttpSession session=request.getSession();
        out.println(SessionListenerTest.getActiveSessions());

        out.println("</h2><br/>");
        out.println("<form action='/OverHttpSessionServlet' method='GET'>");
        out.println("<input type='submit' value='结束当前会话'/>");
        out.println("</form></body></html>");
    }
}

























