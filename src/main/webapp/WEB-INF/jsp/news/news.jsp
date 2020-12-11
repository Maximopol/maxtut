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
            ${news.title}

            Создана${news.date}
             Автор ${news.author}


                ${news.myFile.text}
        </div>

        <div>
            <a class="" href="${pageContext.request.contextPath}/node/${news.id}">
                Комменты
            </a>
        </div>
    </div>
</div>
</body>
</html>
