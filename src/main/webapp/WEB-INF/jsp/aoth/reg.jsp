<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 03.12.2020
  Time: 16:27
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
                <input class="" type="password" name="passwordConfirm" placeholder="Confirm the password" th:field="*{passwordConfirm}" />
            </div>

            <div>
                ${Error}
            </div>

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
