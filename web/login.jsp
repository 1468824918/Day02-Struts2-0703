<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/11
  Time: 上午9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<form action="/user/login_UI.action" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
<a href="register.jsp">点击去注册</a>
</body>
</html>
