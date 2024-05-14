package com.example.classDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name = "Rigist",value = "/Rigist")
public class Rigist extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取regist里面输入的账号和密码
        String name=request.getParameter("name");
        String iphone=request.getParameter("iphone");
        String password=request.getParameter("password");

        //对html表单获取的信息，进行处理方便-输入数据库
        byte b[]=name.getBytes("ISO-8859-1");
        name=new String(b,"UTF-8");
        byte b1[]=iphone.getBytes("ISO-8859-1");
        iphone=new String(b1,"UTF-8");
        byte b2[]=password.getBytes("ISO-8859-1");
        password=new String(b2,"UTF-8");


        //从数据库获取信息-通过账号获取密码，进行登录
        UserDao uDao=new UserDao();
        User U=new User();
        U=uDao.selectUserByiphone(iphone);
        String pass=U.getPassword();

      if (pass.equals("") && !iphone.equals("")) {
        //把信息放进一个对象里面，方便进行注册
         User u = new User();
         u.setName(name);
         u.setIphone(iphone);
         u.setPassword(password);

         UserDao dao = new UserDao();
         dao.addUser(u);
          request.getRequestDispatcher("Login2.html").forward(request,response);
          JOptionPane.showMessageDialog(null,"注册成功");

       }else {
          request.getRequestDispatcher("regist.html").forward(request,response);
          JOptionPane.showMessageDialog(null,"请检查信息是否完整！账号可能已存在!");
      }


    }
}
