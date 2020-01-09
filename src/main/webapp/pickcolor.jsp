<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/8/20
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>color pick</title>
    <jsp:include page="partials/links.jsp" />
</head>
<body>

<form method="post" action="colorPicked.jsp">
    <div class="form-group">
        <label for="color">Pick a color</label>
        <input type="color" class="form-control" id="color" aria-describedby="emailHelp" name="color">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="partials/script.jsp" />
</body>
</html>
