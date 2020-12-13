<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/aoth/aoth.css">
</head>
<body>

<div class="vladmaxi-top">
    <a href="${pageContext.request.contextPath}/" target="_blank">Главная MaxTuT</a>
    <span class="right">
        <a href="${pageContext.request.contextPath}/login">
                <strong>Войти</strong>
            </a>
        </span>
    <div class="clr"></div>
</div>

<div id="login-form">
    <h1>Регистрация</h1>

    <fieldset>
        <form method="post">
            <input class="" type="text" name="username" placeholder="Username" th:field="*{username}" />
            <input class="" type="email" name="email" placeholder="Email" th:field="*{email}" />
            <input class="" type="password" name="password" placeholder="Password" th:field="*{password}" />
            <input class="" type="password" name="confirmPassword" placeholder="Confirm the password" th:field="*{confirmPassword}" />

            <input type="submit" value="Создать">
            <footer class="clearfix">
                <p><span class="info">?</span><a href="#">Забыли пароль?</a></p>
                <p><span class="info">?</span><a href="${pageContext.request.contextPath}/login">Есть аккаунт?</a></p>
            </footer>
        </form>
    </fieldset>

</div>

</body>
</html>
