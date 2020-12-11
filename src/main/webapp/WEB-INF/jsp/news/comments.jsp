<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 03.12.2020
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<div class="">
    <div class="">


        <div class="">
            <c:forEach var="comments" items="${comments}">
                <c:out value="${comments.text}"/>

            </c:forEach>


        </div>
    </div>

</div>

</body>
</html>
