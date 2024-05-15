<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
         response.setContentType("text/html;charset=utf-8");
         if (session.getAttribute("uname")!=null){
             session.invalidate();
             out.println("退出成功，3秒回跳跃到登录页面");
             response.setHeader("refresh","3;url=login.jsp");
         }else {
             out.println("没有登录，3秒回跳转到登录页面");
             response.setHeader("refresh","3;url=login,jsp");
         }
     %>
</body>
</html>





