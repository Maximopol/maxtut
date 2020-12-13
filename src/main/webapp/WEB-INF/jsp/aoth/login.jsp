<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Вход</title>
    <link rel="stylesheet" type="text/css" href="../css/aoth/aoth.css">
</head>

<body>

<div class="vladmaxi-top">
    <a href="${pageContext.request.contextPath}/" target="_blank">Главная MaxTuT</a>
    <span class="right">
        <a href="${pageContext.request.contextPath}/registration">
                <strong>Создать аккаунт</strong>
            </a>
        </span>
    <div class="clr"></div>
</div>

<div id="login-form">
    <h1>Авторизация</h1>

    <fieldset>
        <form method="post">
            <input class="" type="email" name="email" placeholder="Email" th:field="*{email}" />
            <input class="" type="password" name="password" placeholder="Password" th:field="*{password}" />
            <input type="submit" value="ВОЙТИ">
            <footer class="clearfix">
                <p><span class="info">?</span><a href="#">Забыли пароль?</a></p>
                <p><span class="info">?</span><a href="${pageContext.request.contextPath}/registration">Нет аккаунта?</a></p>
            </footer>
        </form>
    </fieldset>

</div>

</body>
</html>
