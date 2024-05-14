<%@ page import="com.example.java_web_lab9.Student" %><%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/28
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Student student=(Student)request.getAttribute("student");
        out.println(student.getStuName());
    %>
</body>
</html>
