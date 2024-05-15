<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/22
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <!--通过jsp param传递参数-->
   <jsp:include page="sum.jsp">
       <jsp:param value="100" name="number"/>
   </jsp:include>
</body>
</html>
