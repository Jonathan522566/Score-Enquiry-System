<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/22
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <% String name=request.getParameter("name");
        String stuno=request.getParameter("stuno");
         String school=request.getParameter("school");
         String major=request.getParameter("major");
     %>

     <table align="center">
         <tr><td>姓名</td><td><%=name%></td></tr>
         <tr><td>学号</td><td><%=stuno%></td></tr>
         <tr><td>学校</td><td><%=school%></td></tr>
         <tr><td>专业</td><td><%=major%></td></tr>
     </table>
</body>
</html>
















