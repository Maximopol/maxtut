<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/aoth/aoth.css">
</head>
<body>
<div class="">
    <div class="">
        Sing in
        <form class="" method="post">
            <div class="">
                <input class="" type="text" name="email" placeholder="Email" th:field="*{email}" />
            </div>

            <div class="">
                <input class="" type="password" name="password" placeholder="Password" th:field="*{password}" />
            </div>

            <%--            <div>--%>
            <%--                ${Error}--%>
            <%--            </div>--%>

            <div>
                <button class="">
                    Login
                </button>
            </div>

            <div>
                <a class="" href="${pageContext.request.contextPath}/registration">
                    Create a account
                </a>
            </div>

        </form>
    </div>
</div>
</body>
</html>
