<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/22
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String str=request.getParameter("number");
       int n=Integer.parseInt(str);
       int sum=0;
       for (int i=1;i<=n;i++){
           sum+=i;
       }
    %>
    <p>从1到<%=n%>的累加是：
         <br><%=sum%>
</body>
</html>
