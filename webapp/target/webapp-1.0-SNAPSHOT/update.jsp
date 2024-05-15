<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/26
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改学生信息</title>
</head>
<body  style="background-image: url('classDesign/images/d.jpg');background-size:cover; " >

<form action="Update" method="post">
    <h3 align="center">修改学生信息</h3>
    <table align="center">

        <tr>
            <th width="200" >学号:</th>
            <th width="200" ><input type="text" name="studentNumber" value="${s.studentNumber}" readonly="readonly"></th>
        </tr>
        <tr>
            <th width="200" >姓名:</th>
            <th width="200" ><input type="text" name="studentName" value="${s.studentName}"></th>
        </tr>
        <tr>
            <th width="200" >班级:</th>
            <th width="200" ><input type="text" name="studentClass" value="${s.studentClass}"></th>
        </tr>
        <tr>
            <th width="200" >专业:</th>
            <th width="200" ><input type="text" name="studentMajor" value="${s.studentMajor}"></th>
        </tr>
        <tr>
            <th width="200" >年龄:</th>
            <th width="200" ><input type="text" name="studentAge" value="${s.studentAge}"></th>
        </tr>
        <tr><td colspan="2" align="center">
            <input type="submit"value="修改">
            <input type="reset" value="重置">
        </td></tr>
    </table>
</form>

<h2 align="center"><a href="StudentList">返回主界面</a></h2>
</body>

</html>
