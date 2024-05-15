<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Title</title>
</head>

<%response.setContentType("text/html;charset=utf-8");%>
<body>
     <c:choose>
         <c:when test="${param.dj>=90 && param.dj<=100}">等级为:优秀</c:when>
         <c:when test="${param.dj>=80 && param.dj<90}">等级为:良好</c:when>
         <c:when test="${param.dj>=70 && param.dj<80}">等级为:中等</c:when>
         <c:when test="${param.dj>=60 && param.dj<70}">等级为:及格</c:when>
         <c:otherwise>成绩不合法或者不及格！继续努力!</c:otherwise>
     </c:choose>
</body>

</html>














