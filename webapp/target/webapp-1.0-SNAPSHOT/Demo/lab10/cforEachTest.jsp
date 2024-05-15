<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/5
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        response.setContentType("text/html;charset=utf-8");
        List<String> books=new ArrayList<String>();
        books.add("javaWeb");books.add("Android");
        books.add("Spring"); books.add("Mybatis");
        books.add("java语言"); books.add("c程序设计");
        request.setAttribute("books",books);
    %>
      集中的内容是:<hr/>
      <c:forEach items="${books}" var="book" varStatus="currentStatus">
          当前元素为:<c:out value="${book}"/>&nbsp;&nbsp;
          索引号为:${currentStatus.index}&nbsp;&nbsp;
          当前迭代数:${currentStatus.count}&nbsp;&nbsp;
          <c:if test="${currentStatus.first}">第1次循环操作</c:if>
          <c:if test="${currentStatus.last}">最后1次循环操作</c:if>
          <hr/>
      </c:forEach>





</body>
</html>












