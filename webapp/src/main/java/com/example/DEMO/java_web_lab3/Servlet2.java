package com.example.DEMO.java_web_lab3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;



@WebServlet(name = "Servlet2",value = "/Servlet2")
public class Servlet2 extends HttpServlet {


    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException { }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        InputStream is=request.getInputStream();
        byte buff[]=new byte[1024];
        StringBuilder sb=new StringBuilder();
        int len=0;
        while ((len=is.read(buff))!=-1){
            sb.append(new String(buff,0,len));
        }
        response.getWriter().println(sb.toString());
    }


    /*@Override
    protected void doPost(HttpServletRequest requst, HttpServletResponse respon) throws IOException {
        StringBuilder sb=new StringBuilder();
        BufferedReader br=requst.getReader();
        sb.append(br.readLine());
        respon.getWriter().println(sb.toString());
    }*/


}
