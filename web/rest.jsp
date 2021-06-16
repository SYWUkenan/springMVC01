<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021-06-15
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/rest/user/1" method="get">

    <input type="submit" value="查询">
</form>

<form action="${pageContext.request.contextPath}/rest/user" method="post">
    id:<input type="text" name="id"><p></p>
    姓名:<input type="text" name="name"><p></p>
    <input type="submit" value="新增">
</form>

<form action="${pageContext.request.contextPath}/rest/user/1" method="post">
    <input type="hidden" value="put" name="_method">

    <input type="submit" value="修改">
</form>

<form action="${pageContext.request.contextPath}/rest/user/1" method="post">
    <input type="hidden" value="delete" name="_method">
    <input type="submit" value="删除">
</form>


</body>
</html>
