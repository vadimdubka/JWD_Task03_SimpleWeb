<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<table border="true">
    <p>Go to <a href="index.jsp">index.jsp</a></p>
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Phone number</td>
        <td>e-mail</td>
    </tr>
    <c:forEach var="user" items="${requestScope.users}">
        <jsp:useBean id="user" type="com.dubatovka.simplewebapp.entity.User" scope="page"/>
        <tr>
            <td>${user.fName}</td>
            <td>${user.lName}</td>
            <td>${user.phone}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
