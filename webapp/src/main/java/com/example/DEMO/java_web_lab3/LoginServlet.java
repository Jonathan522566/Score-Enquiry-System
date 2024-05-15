package com.example.DEMO.java_web_lab3;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse respon) throws ServletException, IOException {
        //初始文字类型
        respon.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if(username.equals("jhy")&&password.equals("123")){
            respon.sendRedirect("/webapp_war_exploded/welcom.html");
        }else {
            respon.sendRedirect("/webapp_war_exploded/Login.html");   //重新进入
        }
    }
}
*/

















