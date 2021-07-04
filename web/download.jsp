<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021-07-03
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/download">下载文件</a>


<form enctype="multipart/form-data" action="${pageContext.request.contextPath}/upload" method="post">
    <p>文件描述：<input type="text" name="desc"></p>

    <p>文件 <input type="file" name="myfile"> </p>
    <p> <input type="submit" value="单个提交"> </p>

</form>

<form enctype="multipart/form-data" action="${pageContext.request.contextPath}/upload02" method="post">
    <p>文件描述：<input type="text" name="desc"></p>

    <p>文件 <input type="file" name="myfile" multiple accept="image/*"> </p>
    <p> <input type="submit" value="多个文件提交"> </p>

</form>
</body>
</html>
