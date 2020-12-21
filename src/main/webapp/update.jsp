<%@ page import="com.cx.po.Student" %>
<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<%
    Student student=(Student)request.getAttribute("student");
    String oldSex = student.getSex().trim();
%>
<head>
    <title>Edit</title>
</head>
<body>
<form action="updateServlet" method="post" style="align-items: center">
    <table border="1" align="center">
        <tr>
            <td colspan="2"><h1>编辑学生信息</h1></td>
        </tr>
        <tr>
            <td>编号</td>
            <td><input type="text" name="id" value="${student.id}" readonly="readonly"/></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${student.name}" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${student.age}" /></td>
        </tr>
        <tr>
            <td>性别</td>
<%--            <td><input type="text" name="sex" value="${student.sex}" /></td>--%>
            <td><select name="sex">
                <option value="男" <%if("男".equals(oldSex)){ %>selected="selected"<%}%>>男</option>
                <option value="女" <%if("女".equals(oldSex)){ %>selected="selected"<%}%>>女</option>
            </select></td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="mobile" value="${student.mobile}" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
                <input type="button" value="Back" onclick="history.go(-1)"/>
            </td>

        </tr>
    </table>

</form>
</body>
</html>