<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/22
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <jsp:forward page="info.jsp">
       <jsp:param name="name" value="wzx"/>
       <jsp:param name="stuno" value="212"/>
       <jsp:param name="school" value="seig"/>
       <jsp:param name="major" value="software"/>
   </jsp:forward>
</body>
</html>
