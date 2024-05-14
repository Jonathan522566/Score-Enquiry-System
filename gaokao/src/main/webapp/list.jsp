<%@ page import="com.example.classDesign.Student" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/26
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>学生信息管理系统</title>
    <style>
        td, th {
            /* white-space: nowrap; 文本不换行显示 */
            white-space: nowrap;
            width: 70px;
            height: 35px;
            /*text-align: center;文本居中显示*/
            text-align: center;
        }

        /* div块居中显示 */
        .divcenter {
            width: 750px;
            height: 700px;
            background-color: #9bfaff;
            /* overflow: auto;当内容溢出时添加滚动条 */
            overflow: auto;
            /* margin: auto;使div块居中显示 */
            margin: auto;
        }
    </style>
</head>



<body  style="background-image: url('classDesign/images/d.jpg');background-size:cover; " >
<div class="divcenter">
    <h3 align="center">所有学生信息</h3>

    <%-- style="text-align: center; 使form表单居中显示 --%>
    <form action="StudentListByName" style="text-align: center;margin-top: 10px">
        <input type="submit" value="高级查询">
        <input type="button" value="增加学生信息" onclick="window.location.href='add.jsp'">
        <input type="button" value="删除学生信息" onclick="window.location.href='delete.jsp'">
    </form>



    <%
        List<Student> list = (List<Student>) request.getAttribute("studentInfoList");
    %>

    <table border=2 bgcolor="aqua" align="center">

        <tr>
            <th width="200" >学号</th>
            <th width="200" >姓名</th>
            <th width="200" >班级</th>
            <th width="200" >专业</th>
            <th width="200" >年龄</th>
            <th width="200" colspan="1" >操作</th>
            <th width="200" colspan="1" >课程</th>
        </tr>

        <%

            for (Student student : list) {%>

        <tr align="center">
            <td><%=student.getStudentNumber()%></td>
            <td><%=student.getStudentName()%></td>
            <td><%=student.getStudentClass()%></td>
            <td><%=student.getStudentMajor()%></td>
            <td><%=student.getStudentAge()%></td>
            <td>
                <a href="Update?number=<%=student.getStudentNumber()%>">修改</a>
            </td>
            <td>
                <a href="LessonByStudentMajor?studentMajor=<%=student.getStudentMajor()%>">课程查询</a>
            </td>

        </tr>

        <% } %>


    </table>
    <h2 align="center"><a href="Login2.html">退出登录</a></h2>

</div>

</body>

</html>
