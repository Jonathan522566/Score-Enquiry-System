package com.example.DEMO.java_web_lab4;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="IndexServlet",value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse respon) throws ServletException, IOException {
        //设置响应内容编码
        respon.setContentType("text/html;charset=utf-8");
        //获取session，注意一定要加false，不允许手动创建：
        HttpSession session=requset.getSession(false);
        //判断：session为空，或者session中的username不为jhy，说明没有登录
        if (null==session || !"jhy".equals(session.getAttribute("username"))){
            //登录失败重新回到登录界面
            respon.sendRedirect("Login.html");
        }else{
            //登录成功，准备html页面展示session中的数据
            String html="<h1 style='color : green'>"+"欢迎"+session.getAttribute("username")+"登录成功!!!</h1>&nbsp;";
            html+="<a href='/webapp_war_exploded/LogoutServlet'>退出登录</a>";
            //响应html页面
            respon.getWriter().append(html);
        }

    }
}









