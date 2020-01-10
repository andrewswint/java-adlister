<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/10/20
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>contacts</title>
</head>
<body>
<c:forEach var="contact" items="${contacts}">
    <div class="contact">
        <h2>${contact.firstName}${contact.lastName}</h2>
        <p>${contact.phoneNumber}</p>
    </div>
</c:forEach>
<form method="POST" action="/contacts">
    <h1>Create a new contact:</h1>
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName">
    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" name="lastName">
    <label for="phoneNumber">Phone Number:</label>
    <input type="text" id="phoneNumber" name="phoneNumber">
    <button type="submit">Submit!</button>
</form>
</body>
</html>
