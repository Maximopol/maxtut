<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 03.12.2020
  Time: 16:54
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
            <c:forEach var="news" items="${news}">
<%--                <c:out value="${comments.text}"/>--%>
                <div class="">
                    <a class="" href="${pageContext.request.contextPath}/news/${news.id}">
                            ${news.title}
                    </a>
                </div>
            </c:forEach>
        </div>

    </div>

</div>

</body>
</html>
