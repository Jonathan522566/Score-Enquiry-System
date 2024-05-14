package com.example.classDesign;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(name ="Delete",value = "/Delete")
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number=request.getParameter("studentNumber");

        if(number!=null&&!number.equals("")){
            StudentDao dao=new StudentDao();
            dao.deleteStudent(number);
            request.getRequestDispatcher("StudentList").forward(request,response);
            JOptionPane.showMessageDialog(null,"删除成功！");
        }else {
            request.getRequestDispatcher("delete.jsp").forward(request,response);
            JOptionPane.showMessageDialog(null,"请检查学号是否完整！不存在该学号！！");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

}































