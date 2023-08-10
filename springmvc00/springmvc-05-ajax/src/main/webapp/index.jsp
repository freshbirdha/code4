<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.4.js"></script>
</head>
<body>
用户名:<input type="text" id="username" onblur="a()">
</body>
</html>

<script>
    function a(){
        $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
            success:function (data,status){
                console.log("data=" + data);
                console.log("status=" + status);
            }


        })
    }



</script>
