<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/4
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <jsp:useBean id="stu" class="com.example.java_web_lab9.Student"/>
     <c:set var="student" value="<%=stu%>"/>
     <c:set target="${student}" property="stuName" value="zhangsan"/>
     <c:set target="${student}" property="stuNo" value="210021"/>
     <c:set target="${student}" property="stuAge" value="20"/>
     <c:out value="${student.stuNo}"/><br>
     <c:out value="${student.stuName}"/><br>
     <c:out value="${student.stuAge}"/><br>
     <c:remove var="student"/>
     ${empty stu}<br>
     ${empty student}
     <c:out value="${student.stuName}"/>
</body>
</html>





