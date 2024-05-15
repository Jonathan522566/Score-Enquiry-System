<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/11
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@page import="org.springframework.web.context.WebApplicationContext" %>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@page import="com.example.DEMO.java_web_lab11.DbDao" %>
<%@page import="com.example.DEMO.java_web_lab11.StudentDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

   <%
      WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
      DbDao dbDao=context.getBean(DbDao.class);

      StudentDao studentDao=(StudentDao) context.getBean("studentDao");
      session.setAttribute("studentDao",studentDao);
   %>

DbDao运行结果:<%=dbDao.DbOpration()%>
学生姓名:${studentDao.stuName}<br>
学生学号:${studentDao.stuNo}<br>
学生年龄:${studentDao.stuAge}<br>
学生信息:${studentDao.toString()}

</body>
</html>













