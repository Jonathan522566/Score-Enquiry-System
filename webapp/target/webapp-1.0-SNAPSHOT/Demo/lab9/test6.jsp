<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/28
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="stu" scope="page" class="com.example.DEMO.java_web_lab9.Student"/>
    <jsp:setProperty name="stu" property="stuNo" param="stuNo"/>
    <jsp:setProperty name="stu" property="stuName" param="stuName1"/>
    <jsp:setProperty name="stu" property="stuAge" param="stuAge1"/>
    <%=stu.getStuNo()%>
    <%=stu.getStuName()%>
    <%=stu.getStuAge()%>
</body>
</html>
