<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/6
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>



      <div align="center"/>
      <h1>用户注册</h1>
      <form action="check.jsp" method="post">
          用&nbsp;&nbsp;户&nbsp;&nbsp;名:<input type="text" name="user"><br>
          密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="pass"><br>
          确&nbsp;认&nbsp;密&nbsp;码:<input type="password" name="repass"><br>
          真实名字:<input type="text" name="realname"><br>
          性&nbsp;&nbsp;&nbsp;&nbsp;别:<input type="radio" name="gender" value="man">男
          <input type="radio" name="gender" value="women">女<br>
          你从哪里知道本网站主题:<br>
          <input type="checkbox" name="chanel" value="报纸"/>网站
          <input type="checkbox" name="chanel" value="报纸"/>报纸
          <input type="checkbox" name="chanel" value="电视"/>电视<br>
          <input type="submit" value="提交">
      </form>


</body>
</html>
