<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspl_core.jsp</title>
</head>
<body>
     <h1>c:import</h1>
     <c:import url="test1.jsp"></c:import>
     <hr>
     <c:import url="http://www.baidu.com" var="thisPage" charEncoding="UTF-8"/>
</body>
</html>
