<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/10/20
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="contact">
<c:forEach var="contact" items="${contacts}">
    <h2>${contact.firstName}${contact.lastName}</h2>
    <p>${contact.phoneNumber}</p>
</c:forEach>
</div>
</body>
</html>
