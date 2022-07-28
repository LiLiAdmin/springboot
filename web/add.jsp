<%--
  Created by IntelliJ IDEA.
  User: lili
  Date: 2022/1/19
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/account/add" method="post" enctype="multipart/form-data">
      <%--name和类中的属性一样--%>
      账户名:<input  type="text"  name="name"/><br/>
      账户余额:<input  type="text" name="money" /><br/>
          <%--name名字不要写成属性名--%>
      头像:<input  type="file" name="file" /><br/>
      <input type="submit"  value="新增">
  </form>
</body>
</html>
