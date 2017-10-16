<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/11
  Time: 上午9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
<h1>恭喜你登录成功${username}</h1>
---->${user.username}
<%--<c:forEach var="list" items="${list}">--%>
    <%--${list}--%>
<%--</c:forEach>--%>
<c:forEach var="u" items="${username}">
    ${u}
</c:forEach>
<c:forEach var="p" items="${password}">
    ${p}
</c:forEach>
</body>
</html>
