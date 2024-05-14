package com.example.classDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LessonByStudentMajor",value = "/LessonByStudentMajor")
public class LessonByStudentMajor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收
        String studentMajor=request.getParameter("studentMajor");
        String studentM;//在数据库的名字

        //软工
        if(studentMajor.equals("软件工程系")){
            studentM="classmessage_rjgc";
            //进行调用
            LessonDao ldao=new LessonDao();
            List<Lesson> list=ldao.getAllLesson("classmessage_rjgc");
            request.setAttribute("lessonInfoList",list);
            request.getRequestDispatcher("lessonlist.jsp").forward(request,response);
        }

        //管理
        if(studentMajor.equals("管理系")){
            studentM="classmessage_gl";
            //进行调用
            LessonDao ldao=new LessonDao();
            List<Lesson> list=ldao.getAllLesson(studentM);
            request.setAttribute("lessonInfoList",list);
            request.getRequestDispatcher("lessonlist.jsp").forward(request,response);
        }

        //会计
        if(studentMajor.equals("会计系")){
            studentM="classmessage_hj";
            //进行调用
            LessonDao ldao=new LessonDao();
            List<Lesson> list=ldao.getAllLesson(studentM);
            request.setAttribute("lessonInfoList",list);
            request.getRequestDispatcher("lessonlist.jsp").forward(request,response);
        }

        //外语
        if(studentMajor.equals("外语系")){
            studentM="classmessage_wy";
            //进行调用
            LessonDao ldao=new LessonDao();
            List<Lesson> list=ldao.getAllLesson(studentM);
            request.setAttribute("lessonInfoList",list);
            request.getRequestDispatcher("lessonlist.jsp").forward(request,response);}

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
