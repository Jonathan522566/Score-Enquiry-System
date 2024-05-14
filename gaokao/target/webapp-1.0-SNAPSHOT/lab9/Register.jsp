<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/29
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.example.java_web_lab9.RegisterBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <div align="center"/>
         <h1>用户注册</h1>
     <form action="info.jsp" method="post">
         用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input type="text" name="user"><br>
         密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="pass"><br>
         真实名字:<input type="text" name="realname"><br>
         性&nbsp;&nbsp;&nbsp;&nbsp;别:<input type="radio" name="gender" value="man">男
         <input type="radio" name="gender" value="women">女<br>
         你从哪里知道本网站主题:<br>
         <input type="checkbox" name="chanel" value="网站"/>网站
         <input type="checkbox" name="chanel" value="报纸"/>报纸
         <input type="checkbox" name="chanel" value="电视"/>电视<br>
         <input type="submit" value="提交">
     </form>
</body>
</html>
