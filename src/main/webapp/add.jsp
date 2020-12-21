<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="addServlet" method="post">
    <table border="1" align="center">
        <tr>
            <td colspan="2"><h1>添加学生信息</h1></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>性别</td>
<%--            <td><input type="text" name="sex"/></td>--%>
            <td><select name="sex">
                <option value="男" selected>男</option>
                <option value="女">女</option>
            </select></td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="mobile"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submint">
                <input type="reset" value="Flush">
            </td>
        </tr>
    </table>
</form>
</body>
</html>