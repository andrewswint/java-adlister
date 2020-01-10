<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/9/20
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
    <jsp:include page="../partials/head.jsp">
    <jsp:param name="title" value="Please Log In" />
</jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<h1>Ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
