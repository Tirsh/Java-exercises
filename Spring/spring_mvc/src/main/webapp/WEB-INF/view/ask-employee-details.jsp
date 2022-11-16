<%--
  Created by IntelliJ IDEA.
  User: valeriy
  Date: 16.11.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Details</title>

</head>
<body>
    <h2>Dear Employee, please insert our details:</h2>
    <br>
    <br>
    <form action="/showDetails" method="get">
        <input type="text" name="employeeName" placeholder="Write your name:"/>
        <input type="submit">
    </form>

</body>
</html>
