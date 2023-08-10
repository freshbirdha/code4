<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/18
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多文件上传</title>
</head>
<body>
<form action="moreUpload.action" method="post" enctype="multipart/form-data">
    <div>
        <label>选择文件1</label>
        <input type="file" name="upload">
    </div>

    <div>
        <label>选择文件2</label>
        <input type="file" name="upload">
    </div>
    <input type="submit">
</form>
</body>
</html>
