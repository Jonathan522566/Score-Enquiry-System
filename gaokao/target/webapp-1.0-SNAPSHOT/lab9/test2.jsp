<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/28
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="stu1" class="com.example.java_web_lab9.Student" scope="page"/>
<html>
<head>
    <title>Title</title>
</head>
    <body>
     <jsp:setProperty name="stu1" property="stuAge" value="20"/>
     <jsp:setProperty name="stu1" property="stuName" value="zhangsan"/>
     <jsp:setProperty name="stu1" property="stuNo" value="2020001"/>
     <%=stu1.getStuName()%>
     <%=stu1.getStuNo()%>
     <%=stu1.getStuAge()%>
    </body>
</html>
