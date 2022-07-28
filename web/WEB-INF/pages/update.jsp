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
    <title>修改页面</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/account/update" method="post">
      <%--隐藏域   id--%>
      <input  type="hidden"  value="${account.id}" name="id">
      <%--name和类中的属性一样--%>
      账户名:<input  type="text"  name="name" value="${account.name}"/><br/>
      账户余额:<input  type="text" name="money"  value="${account.money}"/><br/>
      <input type="submit"  value="修改">
  </form>
</body>
</html>
