<%--
  Created by IntelliJ IDEA.
  User: andrewswint
  Date: 1/8/20
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="links.jsp" />
</head>
<body>


<div class="row">
    <div class="col s12 m12">
        <div class="card blue-grey darken-1">
            <div class="card-content white-text">
                <span class="card-title">Card Title</span>
                <p>I am a very simple card. I am good at containing small bits of information.
                    I am convenient because I require little markup to use effectively.</p>
            </div>
            <div class="card-action">
                <a href="#">This is a link</a>
                <a href="#">This is a link</a>
            </div>
        </div>
    </div>
</div>

<jsp:include page="script.jsp" />
</body>
</html>
