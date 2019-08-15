
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            width: 500px;
            border: 1px solid silver;
            border-collapse: collapse;
        }
        td{
            border: 1px solid silver;
        }
    </style>
</head>
<body>
<a href="list.jsp">添加</a>
<table>
    <tr><td>编号</td><td>姓名</td><td>金额</td><td>删除</td><td>编辑</td></tr>
     <c:forEach var="account" items="${accounts}">
         <tr><td>${account.id}</td><td>${account.name}</td><td>${account.money}</td><td>删除</td><td>编辑</td></tr>
     </c:forEach>

</table>
</body>
</html>
