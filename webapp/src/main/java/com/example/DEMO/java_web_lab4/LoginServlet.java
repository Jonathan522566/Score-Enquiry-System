package com.example.DEMO.java_web_lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;



@WebServlet(name="LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        }

        protected void doPost(HttpServletRequest request, HttpServletResponse respon) throws ServletException, IOException {
            //初始文字类型
            respon.setContentType("text/html;charset=utf-8");
            request.setCharacterEncoding("utf-8");
            String username=request.getParameter("username");
            String password=request.getParameter("password");

            if(username.equals("jhy")&&password.equals("123")){
                //登录成功创建session
                HttpSession session=request.getSession(true);
                //设置登录的用户名为参数
                session.setAttribute("username",username);
                //创建cookie并存入jsessionid
                Cookie cookie=new Cookie("JSESSIONID",session.getId());
                //设置cookie的过期时间
                cookie.setMaxAge(60*60);
                //通过响应对象将cookie发送到浏览器
                respon.addCookie(cookie);
                //重定向到主页
                respon.sendRedirect("/webapp_war_exploded/IndexServlet");
            }else {
                respon.sendRedirect("/webapp_war_exploded/Login.html");   //重新进入
            }
        }
}

