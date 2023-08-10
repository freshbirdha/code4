<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/17
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="user_login.action" method="post">
    <div>
        <label>用户名:</label>
        <input type="text" name="userName">
    </div>
    <div>
        <label>密码:</label>
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="登录">
    </div>
</form>
</body>
</html>
