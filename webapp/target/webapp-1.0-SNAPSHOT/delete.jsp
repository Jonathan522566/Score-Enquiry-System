<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/12/2
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改学生信息</title>
</head>
<body  style="background-image: url('classDesign/images/d.jpg');background-size:cover; " >

  <form action="Delete" method="post">

    <h3 align="center">删除学生信息</h3>
    <table align="center">
        <tr>
            <th width="200" >学号:</th>
            <th width="200" ><input type="text" name="studentNumber"></th>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit"value="删除">
            </td></tr>
    </table>

  </form>

  <h2 align="center"><a href="StudentList">返回主界面</a></h2>

</body>
</html>
