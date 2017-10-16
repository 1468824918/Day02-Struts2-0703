<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/10/11
  Time: 上午9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1>注册</h1>
<form action="${pageContext.request.contextPath}/user/register_UI.action" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    确认密码: <input type="password" name="password1"><br>
    爱好:<input type="checkbox" name="hobbies" checked="checked" value="eat">吃饭
    <input type="checkbox" name="hobbies" value="sleep">睡觉
    <input type="checkbox" name="hobbies" value="study">打豆豆
    <br>
    性别: <br>
    <input type="radio" name="gender" value="male" checked="checked">男
    <input type="radio" name="gender" value="female" >女
    <br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
</form>
</body>
</html>
