package com.example.classDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name ="Add",value = "/Add")
public class Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sno=request.getParameter("studentNumber");
        String sname=request.getParameter("studentName");
        String sclass=request.getParameter("studentClass");
        String smajor=request.getParameter("studentMajor");
        String sage=request.getParameter("studentAge");


        byte b[]=sno.getBytes("ISO-8859-1");
        sno=new String(b,"UTF-8");
        byte b1[]=sname.getBytes("ISO-8859-1");
        sname=new String(b1,"UTF-8");
        byte b2[]=sclass.getBytes("ISO-8859-1");
        sclass=new String(b2,"UTF-8");
        byte b3[]=smajor.getBytes("ISO-8859-1");
        smajor=new String(b3,"UTF-8");
        byte b4[]=sage.getBytes("ISO-8859-1");
        sage=new String(b4,"UTF-8");

        Student s=new Student();
        s.setStudentNumber(sno);
        s.setStudentName(sname);
        s.setStudentClass(sclass);
        s.setStudentMajor(smajor);
        s.setStudentAge(sage);


      if (!sno.equals("") && !sname.equals("") && !sclass.equals("") && !smajor.equals("") && !sage.equals("")){
        StudentDao dao=new StudentDao();
        dao.addStudent(s);
        request.getRequestDispatcher("StudentList").forward(request,response);
        JOptionPane.showMessageDialog(null,"添加成功");
      }else{
          request.getRequestDispatcher("add.jsp").forward(request,response);
          JOptionPane.showMessageDialog(null,"注意信息是否填写完整！可能存在学号重复！请检查！");
      }

    }
}






















