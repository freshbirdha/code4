<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
        color:black;
        font-size: 20px;
      }

      h3{
        width: 180px;
        height: 40px;
        margin:100px auto;
        text-align: center;
        line-height: 40px;
        background: deepskyblue;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allbook">进入书籍页面</a>
  </h3>
  </body>
</html>
