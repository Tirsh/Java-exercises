<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valeriy
  Date: 16.11.2022
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Dear employee, your name ${employee.name} - ${employee.surname}</h2>
    <h3>Salary ${employee.salary}</h3>
    <h3>Department ${employee.department}</h3>
    <h3>Car Model ${employee.carBrand}</h3>
    <h3>Languages:</h3>
    <ul>
        <c:forEach var="lan" items="${employee.languages}">
            <li>${lan}</li>
        </c:forEach>
    </ul>

</body>
</html>
