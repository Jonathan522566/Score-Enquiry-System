<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/29
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      List list=new ArrayList();
      list.add("java web"); list.add("spring"); list.add("mybatis"); list.add("strus");
      pageContext.setAttribute("list",list);
      Map map=new HashMap<>();
      map.put("name","zhangshan");
      map.put("age",20);
      pageContext.setAttribute("map",map);
    %>
     list的大小:${list.size()}<br>
     list中下标为1的值:${list[1]}<br>
     map中name的属性值:${map.name}<br>
     map中age属性的值:${map["age"]}<br>
</body>
</html>
