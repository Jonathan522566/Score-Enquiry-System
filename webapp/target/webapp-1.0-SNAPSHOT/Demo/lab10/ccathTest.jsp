<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <h1>c:catch</h1>
      <c:catch var="myexception">
          <%int a=9/0;%>
      </c:catch>
      <c:out value="${myexception}"></c:out>
</body>
</html>


















