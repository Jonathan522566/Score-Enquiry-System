package com.example.DEMO.java_web_lab4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookicRecord",value = "/CookicRecord")
public class CookicRecord extends HttpServlet {
      public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
          response.setContentType("text/html;charset=utf-8");
          String LastAccessTime=null;
          Cookie [] cookies=request.getCookies();

          for (int i=0;cookies!=null && i<cookies.length;i++){
              if ("LastAccess".equals(cookies[i].getName())){//获取cookie的值是不是我们要的
                  LastAccessTime=cookies[i].getValue();  //获取cookie的值(访问时间)
                  break;
              }
          }
          if (LastAccessTime==null){
              response.getWriter().println("您是第一次访问本网站");
          }else {
              response.getWriter().println("您上次访问的时间是："+LastAccessTime);
          }
          String currentTime=new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss").format(new Date());
          Cookie cookie=new Cookie("LastAccess",currentTime);
          cookie.setMaxAge(60*60);  //获取cookie在客户浏览器保持的有效秒数
          response.addCookie(cookie); //添加一个cookiec
      }
}



































































