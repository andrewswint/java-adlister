<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/8/20
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="partials/links.jsp" />
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<form>
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" aria-describedby="emailHelp" name="username">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" name="password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>


<%--    <form method="post" action="">--%>
<%--        <label for="username">Username</label>--%>
<%--        <input type="text" id="username" name="username">--%>
<%--        <label for="password">Password</label>--%>
<%--        <input type="password" id="password" name="password">--%>
<%--        <button type="submit" value="Submit">Submit</button>--%>
<%--    </form>--%>

    <c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equals('password')}" >
        <c:redirect url="profile.jsp">
        </c:redirect>
    </c:if>

<jsp:include page="partials/script.jsp" />
</body>
</html>
