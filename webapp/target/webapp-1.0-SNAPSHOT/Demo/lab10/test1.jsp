<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/4
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <c:out value="这是一个双标记写法"></c:out><br>
    <c:out value="这是一个单标记写法"/><br>
    <c:out value="${5+6}"/>
</body>
</html>
