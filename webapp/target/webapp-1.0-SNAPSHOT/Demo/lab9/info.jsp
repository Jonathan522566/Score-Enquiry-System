<%@ page import="com.example.DEMO.java_web_lab9.RegisterBean" %>
<%@ page import="java.util.Vector" %><%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/29
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <%request.setCharacterEncoding("utf-8");%>


    <jsp:useBean id="stu" class="com.example.DEMO.java_web_lab9.RegisterBean" scope="request">
      <jsp:setProperty name="stu" property="*"/>
    </jsp:useBean>

      <h3>用户信息输出el标签输出<h3>
    用户名字:${stu.user}
    用户密码:${stu.pass}
    真实名字:${stu.realname}
    性别:${stu.gender}
    信息来源渠道：
            <%
                RegisterBean rb=(RegisterBean) request.getAttribute("stu");
               String[] chanel=rb.getChanel();
                String str="";
                for (int i=0;i<chanel.length;i++){
                    str=str+chanel[i]+"";
                }
                request.setAttribute("str",str);
                out.println(str);
            %><br>


     <h3>用户信息getporper输出<h3>
              <jsp:getProperty name="stu" property="user"/>
              <jsp:getProperty name="stu" property="pass"/>
              <jsp:getProperty name="stu" property="realname"/>
              <jsp:getProperty name="stu" property="gender"/>
</body>
</html>
