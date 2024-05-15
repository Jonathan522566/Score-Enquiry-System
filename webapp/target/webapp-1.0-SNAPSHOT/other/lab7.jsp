
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h1>scriptlet演示</h1><br/>
     <%
         for (int i=1;i<=9;i++){
             for (int j=1;j<=i;j++){
               out.print(i+"*"+j+"="+i*j+"&nbsp;&nbsp;&nbsp;");
             }
             out.println("<br/>");
         }

     %>
</body>
</html>
