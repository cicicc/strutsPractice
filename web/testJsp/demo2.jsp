<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/10
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
测试页面
reqValue:${requestScope.reqValue}<br>
sessValue:${sessionScope.sessValue}<br>
${applicationScope.AppValue}
</body>
</html>
