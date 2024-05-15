<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2022/11/6
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
        String[] str=new String[]{"a","b","c"};
        session.setAttribute("str",str);
     %>
      "(1)fn.length:"${fn:length("abcdefg")}<br>
     "(2)fn.contains:"${fn:contains("abcdefg","bcD")}<br>
     "(3)fn.containsIgnoreCase:"${fn:containsIgnoreCase("abcdefg","bcD")}<br>
      "(4)fn:startwith"${fn:startsWith("abcdefg","fh" )}<br>
      "(5)fn:endwith"${fn:endsWith("abcdefg","fg" )}<br>
      "(6)fn:indexOf:"${fn:indexOf("abcdefg","fg" )}<br>
      "(7)fn:join:"${fn:join(sessionScope.str,",")}
       "(8)fn:replace:"${fn:replace("ABC","A" ,"B" )}
       "(9)fn:split:"${fn:split("A,B,C","," )}
</body>
</html>




















