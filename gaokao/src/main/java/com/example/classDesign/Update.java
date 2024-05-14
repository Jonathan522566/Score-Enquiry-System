package com.example.classDesign;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Update")
public class Update extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        String number1=request.getParameter("number");
        if(number1!=null&&!number1.equals("")) {
            StudentDao dao=new StudentDao();
            Student s=dao.selectStudentByNumber(number1);
            request.setAttribute("s", s);
        }
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //doGet(request, response);
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

        StudentDao dao=new StudentDao();
        dao.updateStudent(s);

        request.getRequestDispatcher("StudentList").forward(request, response);
    }
}
