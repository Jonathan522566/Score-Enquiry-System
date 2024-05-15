package com.example.DEMO.java_web_lab4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet",value = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得当前session，注意用false
        HttpSession session=request.getSession(false);
        //判断session是否为空
        if(session!=null){
            session.invalidate();
        }
        //通过jsessionid 获取cookie对象
        Cookie cookie=new Cookie("JSESSIONID","");
        //设置cookie的有效期
        cookie.setMaxAge(0);
        //发送cookie数据到浏览器
        response.addCookie(cookie);
        response.sendRedirect("/webapp_war_exploded/IndexServlet");

    }


}
