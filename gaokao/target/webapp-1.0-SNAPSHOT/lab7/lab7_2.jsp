
<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/14
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=utf-8" language="java"
           %>
<%@ page import="com.example.java_web_lab7.studentDao" %>
<%@page import="java.util.Map" %>
<%@ page import="com.example.java_web_lab7.ServletLab7" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

     <table border="1px">
          <tr>
              <th>用户名</th>
              <th>密码</th>
              <th>电话</th>
              <th>性别</th>
              <th>年龄</th>
              <th>爱好</th>
          </tr>



          <tr>
              <th><%out.println(request.getParameter("username"));%></th>
              <th><%out.println(request.getParameter("password"));%></th>
              <th><%out.println(request.getParameter("number"));%></th>
              <th><%out.println(request.getParameter("sex"));%></th>
              <th><%out.println(request.getParameter("age"));%></th>
<%--              <th><%out.println(request.getParameter("hobby"));%></th>--%>
              <th><%=new String(request.getParameter("hobby").getBytes("iso-8859-1"),"UTF-8") %></th>
          </tr>

     </table>

</body>
</html>
