<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl_core.jsp</title>
</head>

<body>
     <h1>c:url</h1>
     <c:url value="http://www.baidu.com" var="bd"/>
     ${bd}
     <br>
     <a href="${bd}">百度一下</a>
</body>
</html>
