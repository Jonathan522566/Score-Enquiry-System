package com.example.DEMO.java_web_lab3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "queryServlet",value = "/queryServlet")
public class queryServlet extends HttpServlet {
    //初始化网页文字


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse respon) throws ServletException, IOException {
        //初始化文字
        respon.setContentType("text/html;charset=utf-8");

        String stuNum=requset.getParameter("stuNum");
        ServletContext context=this.getServletContext();
        String dbUrl=context.getInitParameter("dbUrl");
        String dbUsername=context.getInitParameter("dbUsername");
        String dbPassword=context.getInitParameter("dbPassword");
        String jdbcDriver=context.getInitParameter("jdbcDriver");
        Connection connection=DbUtil.getCon(jdbcDriver,dbUrl,dbUsername,dbPassword);

        String sql="select * from student where stuNum=?";
        PreparedStatement pst=null;
        try {
            pst=connection.prepareStatement(sql);
            pst.setString(1,stuNum);
            ResultSet rs=pst.executeQuery();
            String str="";
            if (rs.next()){
                str=rs.getString("stuNum")+","+rs.getString("stuName");
            }else {
                str="查无此人";
            }
            respon.getWriter().println(str);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


























































