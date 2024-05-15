<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/28
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.DEMO.java_web_lab9.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <%
        Student stu=new Student();
        stu.setStuNo("123");
        stu.setStuName("zhangsan");
        stu.setStuAge(20);
        request.setAttribute("student",stu);
        RequestDispatcher dispatcher=request.getRequestDispatcher("test.jsp");
        dispatcher.forward(request,response);
      %>
</body>
</html>
