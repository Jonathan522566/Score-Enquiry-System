<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/10/14
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <h1>信息</h1>
      <form action="lab7_2.jsp" method="post">
          用户名:<input type="text" name="username"><br/>
          密码:<input type="password" name="password"><br/>
          手机号:<input type="text" name="number"><br/>
          性别:<input type="radio" name="sex" value="man">男
          <input type="radio" name="sex" value="women">女<br/>
          年龄:<input type="text" name="age"><br/>
          爱好:<input type="checkbox" name="hobby" value="电子竞技">电子竞技
          <input type="checkbox" name="hobby" value="美食鉴赏">美食鉴赏
          <input type="checkbox" name="hobby" value="思考人生">思考人生
          <input type="checkbox" name="hobby" value="养精蓄锐">养精蓄锐<br/>
          <input type="submit" value="注册">
          <input type="reset" value="重置"><br/>
      </form>
</body>
</html>
