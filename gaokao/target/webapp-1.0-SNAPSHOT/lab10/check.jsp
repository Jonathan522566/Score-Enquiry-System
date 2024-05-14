<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/6
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
      <%request.setCharacterEncoding("utf-8");%>


     <c:choose>

          <c:when test="${param.user=='' or param.user==null}">
              <c:out value="用户名不能空"/>
          </c:when>
         <c:when test="${param.pass=='' or param.pass==null}">
             <c:out value="密码不能空"/>
         </c:when>
         <c:when test="${param.pass!=param.repass}">
             <c:out value="密码不一致"/>
         </c:when>
         <c:when test="${param.gender=='' or param.gender==null}">
             <c:out value="性别不能空"/>
         </c:when>
         <c:when test="${param.chanel=='' or param.chanel==null}">
             <c:out value="渠道不能空"/>
         </c:when>

         <c:otherwise>
             <jsp:forward page="info.jsp">
                 <jsp:param name="user" value="${param.user}"/>
                 <jsp:param name="pass" value="${param.pass}"/>
                 <jsp:param name="gender" value="${param.gender}"/>
                 <jsp:param name="realname" value="${param.realname}"/>
                 <jsp:param name="chanel" value="${param.chanel}"/>
             </jsp:forward>
         </c:otherwise>

     </c:choose>





</body>
</html>










