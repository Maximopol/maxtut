<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Not found</title>
    <link rel="stylesheet" type="text/css" href="../css/error/error.css">
</head>
<body>

<div class="container">
    <div class="titleError">
        <span class="letter">
             Упс, вы  смогли найти то чего нет :)
        </span>
    </div>

    <div class="errorNumber">
        <span class="numberRed">
             4
        </span>
        <span class="numberGreen">
             0
        </span>
        <span class="numberRed">
             4
        </span>
    </div>

    <div class="labelToBack">
        <span class="letter">
            Вы можете вернутся на <a href="${pageContext.request.contextPath}/">главную</a>
        </span>
    </div>

    <div class="footer">
        <span class="letter">
            Copyright &copy; MaxTut
        </span>
    </div>
</div>

</body>
</html>
