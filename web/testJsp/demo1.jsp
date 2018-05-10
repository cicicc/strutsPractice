<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/10
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form 表单提交值 </title>
</head>
<body>
<%--测试ServletActionContext封装数据--%>
<%--<form action="${pageContext.request.contextPath}/demo2.action" method="post">--%>
<%--测试ActionContext封装数据 属性驱动--%>
<form action="${pageContext.request.contextPath}/demo3.action" method="post">
    姓名: <input type="text" name="name"><br>
    密码: <input type="password" name="password"><br>
    年龄: <input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
