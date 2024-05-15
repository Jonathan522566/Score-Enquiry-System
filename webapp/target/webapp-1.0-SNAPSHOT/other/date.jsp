<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/14
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
         String now=new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss").format(new Date());
     %>
     <h1><%=now%></h1>
</body>
</html>
