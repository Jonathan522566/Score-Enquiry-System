<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/29
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
        pageContext.setAttribute("name","jhy");
        request.setAttribute("age",20);
        session.setAttribute("sex","male");
        application.setAttribute("country","china");
     %>
     <h3>访问演示</h3>
     <table border="1">
         <tr>
             <td>姓名</td><td>年龄</td><td>性别</td><td>国家</td>
         </tr>
         <tr>
             <td>${pageScope.name}</td><td>${requestScope.age}</td>
             <td>${sessionScope.sex}</td><td>${applicationScope.country}</td>
         </tr>
         <td>${name}</td><td>${age}</td><td>${sex}</td><td>${country}</td>
     </table>
</body>
</html>














