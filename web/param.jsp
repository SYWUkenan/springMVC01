<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021-06-10
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>简单参数演示</h2>
<form action="${pageContext.request.contextPath}/param01" method="post">
    姓名：<input name="username" type="text"><p></p>
    <input type="submit" value="提交">

</form>
<h2>复杂参数演示</h2>
<form action="${pageContext.request.contextPath}/param03" method="post">
    id：<input name="id" type="text"><p></p>
    姓名：<input name="name" type="text"><p></p>
    外号：<input name="alias" type="checkbox" value="二猪" checked>二猪
    <input name="alias" type="checkbox" value="三喜" checked>三喜<p></p>
    爱好：<input name="hobbies" type="checkbox" value="唱歌" checked>唱歌
    <input name="hobbies" type="checkbox" value="跳舞" checked>跳舞<p></p>
    亲属：<input name="relatives['father']" type="checkbox" value="爸爸" checked>爸爸
    <input name="relatives['mother']" type="checkbox" value="妈妈" checked>妈妈<p></p>

    角色：<input name="role.name" type="text"> <p></p>
    朋友：<input name="friends[0].name" type="text" value="李四"><br>
    <input name="friends[1].name" type="text" value="张三">
    <%-- private Integer id;
    private String name;
    private String[] alias; //外号
    private List<String> hobbies; //兴趣爱好
    private Map<String,String> relatives; //亲属
    private Role role;
    private List<User> friends;//朋友--%>
    <input type="submit" value="提交">

</form>

</body>
</html>
