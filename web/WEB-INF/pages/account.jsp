<%--
  Created by IntelliJ IDEA.
  User: lili
  Date: 2022/1/18
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户信息</title>
    <script type="text/javascript">
        /*定义函数*/
        function add() {
            location.href="${pageContext.request.contextPath}/add.jsp";
        }
    </script>
</head>
<body>
<p align="center"><input  type="button"  value="添加" onclick="add()"></p>
 <table border="1px"  align="center">
     <tr>
         <th>账户id</th>
         <th>账户名字</th>
         <th>账户余额</th>
         <th>操作</th>
     </tr>
     <c:forEach items="${list}"  var="a">
         <tr>
             <td>${a.id}</td>
             <td>${a.name}</td>
             <td>${a.money}</td>
             <td>
                 <a href="${pageContext.request.contextPath}/account/del?id=${a.id}">删除</a>
                 <a href="${pageContext.request.contextPath}/account/preUpdate?id=${a.id}">修改</a>
             </td>
         </tr>
     </c:forEach>
 </table>
<%--<p align="center">
    <a href="${pageContext.request.contextPath}/ShowServlet?pageNum=${pages.firstPage}">首页</a>
    &lt;%&ndash;判断 是否为第一页&ndash;%&gt;
    <c:if test="${pages.isFirstPage==true}">
          上一页
     </c:if>
    &lt;%&ndash;不是第一页&ndash;%&gt;
    <c:if test="${pages.isFirstPage==false}">
        <a href="${pageContext.request.contextPath}/ShowServlet?pageNum=${pages.prePage}">上一页</a>
    </c:if>
    &lt;%&ndash;是最后一页&ndash;%&gt;
    <c:if test="${pages.isLastPage==true}">
        下一页
    </c:if>
    &lt;%&ndash;不是最后一页&ndash;%&gt;
     <c:if test="${pages.isLastPage==false}">
        <a href="${pageContext.request.contextPath}/ShowServlet?pageNum=${pages.nextPage}">下一页</a>
     </c:if>
    <a href="${pageContext.request.contextPath}/ShowServlet?pageNum=${pages.lastPage}">尾页</a>
    第${pages.pageNum}页/共${pages.pages}页  共${pages.total}条记录
 </p>--%>
</body>
</html>
