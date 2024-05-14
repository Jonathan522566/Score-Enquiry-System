<%@ page import="com.example.classDesign.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/26
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body  style="background-image: url('classDesign/images/d.jpg');background-size:cover; ">

<%-- style="text-align: center; 使form表单居中显示 --%>
<form action="StudentListByName" style="text-align: center;margin-top: 10px">
    <input id="name" name="name" placeholder="按姓名查询">
    <input type="submit" value="查询">
    <input type="button" value="增加学生信息" onclick="window.location.href='add.jsp'">
</form>
<div align="center"/>

<%
    List<Student> list = (List<Student>) request.getAttribute("list");
%>

<table border=2 bgcolor="aqua" align="center">

    <tr>
        <th width="200" >学号</th>
        <th width="200" >姓名</th>
        <th width="200" >班级</th>
        <th width="200" >专业</th>
        <th width="200" >年龄</th>

    </tr>

    <%

        for (Student student : list) {%>

    <tr align="center">
        <td><%=student.getStudentNumber()%></td>
        <td><%=student.getStudentName()%></td>
        <td><%=student.getStudentClass()%></td>
        <td><%=student.getStudentMajor()%></td>
        <td><%=student.getStudentAge()%></td>

    </tr>

    <% } %>

</table>

<h2 align="center"><a href="StudentList">返回主界面</a></h2>

</body>
</html>
