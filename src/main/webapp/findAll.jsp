<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>findAll</title>
    <style type="text/css">
        table {
            border: 1px solid pink;
            margin: 0 auto;}
        td{
            width: 150px;
            border: 1px solid pink;
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>联系方式</td>
        <td>操作</td>
    </tr>
    <c:forEach items = "${lists}" var = "item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.age}</td>
            <td>${item.sex}</td>
            <td>${item.mobile}</td>
            <td><a href="javascript:if(window.confirm('是否确认删除？')){window.location.href = 'deleteById?id=${item.id}';}">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="updateServlet?id=${item.id}">编辑</a> </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="6" style="text-align: center"><a href="add.jsp">添加学生信息</a> </td>
    </tr>
</table>

</body>
</html>