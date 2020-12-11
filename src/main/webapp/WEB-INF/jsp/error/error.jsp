<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Error</title>
    <link rel="stylesheet" type="text/css" href="../css/error/error.css">
</head>
<body>

<div class="container">
    <div class="titleError">
        <span class="letter">
             Упс, что-то не так :)
        </span>
    </div>

    <div class="errorNumber">
        <span class="numberRed">
             ?
        </span>
        <span class="numberRed">
             ?
        </span>
        <span class="numberRed">
             ?
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
