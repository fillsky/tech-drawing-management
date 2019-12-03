<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello, world!</title>
</head>
<body>
<div style="text-align: center">Dzień dobry Spring MVC</div>
<div>
    Just users:
    <c:forEach items="${users}" var="user">
        <p>${user.firstName} ${user.lastName} <span style="font-weight: bold"> ${user.login}</span></p>

    </c:forEach>
</div>
</body>
</html>
