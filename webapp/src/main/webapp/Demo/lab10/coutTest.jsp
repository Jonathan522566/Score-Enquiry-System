<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/4
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:out value="<h1>Test JSTL:out标签</h1>" escapeXml="false"/>
    <c:out value="${user}" default="1.获取上下文参数直接输出:"/>
    <c:out value="${initParam.user}"/>
        <br>
    <c:out value="2.获取上下文参数从out标签体输出:"/>
    <c:out value="${user}">
        From c:out-------${initParam.user}
    </c:out>
</body>
</html>










