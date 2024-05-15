<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forTokens items="blue,red,black|yellow|brown,green|white" delims=",|" var="item">
        ${item}&nbsp;&nbsp;
    </c:forTokens>
</body>
</html>
