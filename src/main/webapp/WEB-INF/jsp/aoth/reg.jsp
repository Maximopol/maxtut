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
        Account creation
        <form class="" method="post">

            <div class="">
                <input class="" type="text" name="username" placeholder="Username" th:field="*{username}" />
            </div>

            <div class="">
                <input class="" type="text" name="email" placeholder="Email" th:field="*{email}" />
            </div>

            <div class="">
                <input class="" type="password" name="password" placeholder="Password" th:field="*{password}" />
            </div>

            <div class="">
                <input class="" type="password" name="confirmPassword" placeholder="Confirm the password" th:field="*{confirmPassword}" />
            </div>

<%--            <div>--%>
<%--                ${Error}--%>
<%--            </div>--%>

            <div>
                <button class="">
                    Create
                </button>
            </div>

            <div>
                <a class="" href="${pageContext.request.contextPath}/login">
                    Login
                </a>
            </div>

        </form>
    </div>
</div>

</body>
</html>
