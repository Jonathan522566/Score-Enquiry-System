<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/4
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <c:if test="${param.username=='jhy'}" var="res1"/>
     <c:if test="${param.password=='123456'}" var="res2"/>
     <c:if test="${res1 && res2}" var="res3">
         welcome:${param.username}
      </c:if>
</body>
</html>
