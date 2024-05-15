<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>获得的初始化参数</h1><br>
    学校是:<%=config.getInitParameter("school")%>
    专业是:<%=config.getInitParameter("major")%>
</body>
</html>
