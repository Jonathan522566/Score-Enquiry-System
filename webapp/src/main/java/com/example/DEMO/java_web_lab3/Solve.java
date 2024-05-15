package com.example.DEMO.java_web_lab3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/Solve")
public class Solve  extends HttpServlet {

    //解决乱码例子
    /**
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=utf-8");//解决乱码问题

        String resStr1="这是一个响应字符串....";
        String resStr2="this is a test String";
        PrintWriter out=response.getWriter();
        out.write ( "«htmL><body>") ;
        out.write (resStr1) ;
        out.write( "‹br/>") ;
        out.write (resStr2) ;
        out.write(  "‹br/>") ;
        out. println(resStr1);
        out.println("<br/>");
        out.println(resStr2);
        out.println("</body></html>");
    }**/


    /*
    //doget的功能是获取头节点 doget 用writer响应，以及用request请求
    //获取信息用request.get....();
    //写入网页语法 /
    //        初始：
    //        response.setContentType("text/html;charset=utf-8");//解决乱码问题
    //        PrintWriter writer=response.getWriter();//写入网页 请求
    //        写入网页：
    //        writer.println();
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        //初始
        response.setContentType("text/html;charset=utf-8");//解决乱码问题
        PrintWriter writer=response.getWriter();//写入网页 请求
        //写入网页
        writer.println("getMethod:"+request.getMethod());
        writer.println("<br/>");
        writer.println("getRequestURI:"+request.getRequestURI());
        writer.println("<br/>");
        writer.println("getProtocol:"+request.getProtocol());
        writer.println("<br/>");
        writer.println("getContextPath:"+request.getContextPath());
        writer.println("<br/>");
        writer.println("getPathInfo:"+request.getPathInfo());
        writer.println("<br/>");
        writer.println("getServletPath:"+request.getServletPath());
    }
    */




  /**  //获取头信息
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        //初始
        response.setContentType("text/html;charset=utf-8");//解决乱码问题
        PrintWriter writer = response.getWriter();//写入网页 请求

        Enumeration headerNames= request.getHeaderNames () ;
        while(headerNames.hasMoreElements()) {                       //有多条信息
            String headerName = (String) headerNames.nextElement(); //继续取值
            writer.println(headerName + ":" + request.getHeader(headerName) + "<br/>");//输出一条信息
        }

    }


   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        InputStream is=request.getInputStream();
        byte buff[]=new byte[1024];
        StringBuilder sb=new StringBuilder();
        int len=0;
        while ((len=is.read(buff))!=-1){
            sb.append(new String(buff,0,len));
        }
        response.getWriter().println(sb.toString());

       // StringBuilder sb=new StringBuilder();
        BufferedReader br=request.getReader();
        sb.append(br.readLine());
        response.getWriter().println(sb.toString());

    }**/

}


