<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome ${sessionScope.username}</h1>
    </div>
    <form method="POST" action="/logout">
    <input type="hidden" value="logout" id="logout" name="logout">
    <input type="submit" class="btn btn-primary btn-block" value="Logout" name="logout">
    </form>

</body>
</html>
