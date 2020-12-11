<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Server error</title>
    <link rel="stylesheet" type="text/css" href="../css/error/error.css">
</head>
<body>

<div class="container">
    <div class="titleError">
        <span class="letter">
             Упс, сервер тупой у нас :)
        </span>
    </div>

    <div class="errorNumber">
        <span class="numberRed">
             5
        </span>
        <span class="numberRed">
             0
        </span>
        <span class="numberRed">
             0
        </span>
    </div>

    <div class="labelToBack">
        <span class="letter">
            Вы можете вернутся на <a href="${pageContext.request.contextPath}/">главную</a>
        </span>
    </div>

    <div class="footer">
        <span class="letter">
            Copyright &copy; MaxTuT
        </span>
    </div>
</div>

</body>
</html>
