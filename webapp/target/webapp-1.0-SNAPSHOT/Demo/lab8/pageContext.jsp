<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%session.setAttribute("test","session");%>
     <%request.setAttribute("test","request");%>
     <%pageContext.setAttribute("test","page");%>
     <%application.setAttribute("test","application");%>
     <%=pageContext.getAttribute("test",pageContext.SESSION_SCOPE)%>
     <%=pageContext.getAttribute("test",pageContext.REQUEST_SCOPE)%>
     <%=pageContext.getAttribute("test",pageContext.PAGE_SCOPE)%>
     <%=pageContext.getAttribute("test",pageContext.APPLICATION_SCOPE)%>
     <%=pageContext.findAttribute("test")%>
</body>
</html>
