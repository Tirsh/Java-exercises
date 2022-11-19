<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        Department <form:select path="department">
<%--            <form:option value="Information Tehnology" label="IT"/>--%>
<%--            <form:option value="Human Resourses" label="HR"/>--%>
<%--            <form:option value="Sales" label="Sales"/>--%>
        <form:options items="${employee.departments}"/>
        <br><br>
        </form:select>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br>
        Foreign languages:
<%--        EN <form:checkbox path="languages" value="English"/>--%>
<%--        DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--        FR <form:checkbox path="languages" value="French"/>--%>
            <form:checkboxes path="languages" items="${employee.languagesList}"/>
        <br>
        <input type="submit" value="Ok"/>

    </form:form>


</body>
</html>
