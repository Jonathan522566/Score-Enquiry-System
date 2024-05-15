package com.example.DEMO.java_web_lab3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse respon) throws ServletException, IOException {
        //初始-设定文字(防止乱码)
        respon.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");            //自对dopost有用
        //获取网页的信息
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String hobbys[] =request.getParameterValues("hobby");
        String hobStr="";
       for (int i=0;i<hobbys.length;i++){
        hobStr=hobStr+hobbys[i]+",";
         }
        respon.getWriter().println("用户名是："+username+",密码是："+password+",爱好是："+hobStr);
    }
}
