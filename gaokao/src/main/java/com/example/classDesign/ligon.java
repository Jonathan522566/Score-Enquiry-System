package com.example.classDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ligon")
public class ligon extends HttpServlet {
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

        //从数据库获取信息-通过账号获取密码，进行登录
       UserDao uDao=new UserDao();
        User u=new User();
        u=uDao.selectUserByiphone(username);
        String pass=u.getPassword();


        //进行匹配
        if(password.equals(pass) && !username.equals("")){
            JOptionPane.showMessageDialog(null,"登录成功");
            respon.sendRedirect("/webapp_war_exploded/Index.jsp");//密码正确后的下一个页面
        }else {
            JOptionPane.showMessageDialog(null,"检查账号与密码，是否匹配而输入完整！");
            respon.sendRedirect("/webapp_war_exploded/Login2.html");   //重新进入
        }
    }

}
