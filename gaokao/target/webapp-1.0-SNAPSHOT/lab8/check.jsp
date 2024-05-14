<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/21
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录验证</title>
</head>
<body>
     <%
        request.setCharacterEncoding("utf-8");
        String name=request.getParameter("username");
        String password=request.getParameter("password");

        if (name.equals("wzx")&&password.equals("123")){
            session.setMaxInactiveInterval(60*60);
            session.setAttribute("uname",name);
            Cookie cookie=new Cookie("JSESSIONID",session.getId());
            response.addCookie(cookie);

            response.sendRedirect("/webapp_war_exploded/lab8/welcom.jsp");
        }else {
            out.print("用户名或者密码错误，3秒后跳转到登录页面");
            response.setHeader("refresh","3;url=login.jsp");
        }
     %>
</body>
</html>
