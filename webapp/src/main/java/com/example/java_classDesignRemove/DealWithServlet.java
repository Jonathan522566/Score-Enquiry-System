package com.example.java_classDesignRemove;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="DealWithServlet",value = "/DealWithServlet")
public class DealWithServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=gb123");
        PrintWriter out=response.getWriter();
        String stuname=request.getParameter("stuname");
        System.out.println("查询学生业务：学生姓名："+stuname);
        out.println("学生姓名:"+stuname);
        out.println("<br>学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp号:123456<br>");
        out.println("<br>系&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp部:软件工程系<br>");
        out.println("<br>班&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp级:javawb班<br>");
    }
}
