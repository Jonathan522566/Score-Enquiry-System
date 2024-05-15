package com.example.DEMO.java_web_lab7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletLab7")
public class ServletLab7 extends HttpServlet {
    String username;
    String password;
    String number;
    String sex;
    String age;
    String hobStr;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //初始化*设定文字
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        //获取网页信息
        username=request.getParameter("username");
        password=request.getParameter("password");
        number=request.getParameter("number");
        sex=request.getParameter("sex");
        age=request.getParameter("age");
        String hobbys[]=request.getParameterValues("hobby");
        hobStr="";
        for (int i=0;i<hobbys.length;i++){
            hobStr=hobStr+hobbys[i]+",";
        }
        //方式一：直接输出/*
  /*      response.getWriter().println("用户名："+username+"  "+"密码："+password+"  "+"电话："+number
        +"  "+"性别："+sex+"  "+"年龄:"+age+"  "+"爱好:"+hobStr);   */

        //方式二:用哈斯算法表格输出
       /* studentDao stuD=new studentDao();
        stuD.setStudenInfo(username,password,number,sex,age,hobStr);*/
    }


}

















