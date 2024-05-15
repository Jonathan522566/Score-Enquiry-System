<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/28
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <jsp:useBean id="stu" scope="page" class="com.example.DEMO.java_web_lab9.Student"/>
      <jsp:setProperty name="stu" property="stuNo"/>
      <jsp:setProperty name="stu" property="stuName"/>
      <jsp:setProperty name="stu" property="stuAge"/>
      <%=stu.getStuNo()%>
      <%=stu.getStuName()%>
      <%=stu.getStuAge()%>
</body>
</html>
