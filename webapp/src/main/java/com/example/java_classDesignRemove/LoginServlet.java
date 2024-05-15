package com.example.java_classDesignRemove;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//验证登录密码
@WebServlet(name = "LoginServlet" ,value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html;charset=utf-8");

        //从网页中获得信息
        String account=request.getParameter("account");
        String password=request.getParameter("password");
        if (account.equals("jhy")&&password.equals("123456")){
            request.getSession().setAttribute("account",account);
            response.sendRedirect("/webapp_war_exploded/classDesign/BUSINESS.html");
        }else {
            response.getWriter().println("登录失败");
        }
    }
}
