<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <div align="center">
         <h1>用户登录</h1>
     <form action="/webapp_war_exploded/lab8/check.jsp" method="post">
         用户名:<input type="text" name="username" placeholder="请输入用户名"><br>
         密&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" placeholder="请输入密码">
         <input type="submit" value="登陆"/>&nbsp;&nbsp;&nbsp;
         <input type="reset" value="重填"/>
     </form>
     </div>
</body>
</html>
