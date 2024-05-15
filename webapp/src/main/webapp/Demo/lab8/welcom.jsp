<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      欢迎您：
      <%
          response.setContentType("text/html;charset=utf-8");
          if(!"wzx".equals(session.getAttribute("uname"))){
              out.println("非法用户，3秒回到登录页面");
              response.setHeader("refresh","3;url=login.jsp");
          }else {
              out.println(session.getAttribute("uname"));
              out.println("<a href='logout.jsp'>注销</a>");
          }
      %>
</body>
</html>





















