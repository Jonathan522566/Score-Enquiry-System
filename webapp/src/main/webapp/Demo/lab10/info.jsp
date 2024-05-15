
<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/6
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>


   <h1>学生信息显示<h1>
    <hr>
   用户名字:${param.user}<br>
   用户密码:${param.pass}<br>
   真实名字:${param.realname}<br>
   性别:${param.gender}<br>
   信息来源渠道：
       <c:forEach items="${paramValues.chanel}" var="item">
           ${item}
       </c:forEach>

</body>
</html>
