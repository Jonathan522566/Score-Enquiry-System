<%@ page import="com.example.classDesign.Lesson" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/12/17
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body  style="background-image: url('classDesign/images/d.jpg');background-size:cover; ">

<div class="divcenter">
    <h3 align="center">所有课程信息</h3>

    <%
        List<Lesson> list = (List<Lesson>) request.getAttribute("lessonInfoList");
    %>

    <table border=2 bgcolor="aqua" align="center">

        <tr>
            <th width="200" >课程编号</th>
            <th width="200" >课程名称</th>
            <th width="200" >学分</th>
            <th width="200" >课程性质</th>
        </tr>

        <%

            for (Lesson lesson : list) {%>

        <tr align="center">
            <td><%=lesson.getKcbh()%></td>
            <td><%=lesson.getKcmc()%></td>
            <td><%=lesson.getXf()%></td>
            <td><%=lesson.getKcxz()%></td>
        </tr>

        <% } %>


    </table>

    <h2 align="center"><a href="StudentList">返回主界面</a></h2>

</div>




</body>
</html>
