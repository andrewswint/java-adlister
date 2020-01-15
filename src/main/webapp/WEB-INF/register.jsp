<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/15/20
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
    <title>register</title>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<form method="POST" action="/register">
    <h2>Create an account!</h2>
    <label for="username">Username</label>
    <input type="text" id="username" name="username">

    <label for="email">Email</label>
    <input type="text" id="email" name="email">

    <label for="password">Password</label>
    <input type="password" id="password" name="password">

    <button type="submit">Submit</button>
</form>

</body>
</html>
