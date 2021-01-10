<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comments</title>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/templatemo.css">
    <link rel="stylesheet" href="../css/news/comments.css">
</head>
<body>
<div class="tm-page-wrap mx-auto">
    <div class="position-relative">
        <div class="potition-absolute tm-site-header">
            <div class="container-fluid position-relative">
                <div class="row">
                    <div class="col-7 col-md-4">
                        <a href="${pageContext.request.contextPath}/" class="tm-bg-black text-center tm-logo-container">
                            <i class="fas fa-video tm-site-logo mb-3"></i>
                            <h1 class="tm-site-name">MaxTuT</h1>
                        </a>
                    </div>
                    <div class="col-5 col-md-8 ml-auto mr-0">
                        <div class="tm-site-nav">
                            <nav class="navbar navbar-expand-lg mr-0 ml-auto" id="tm-main-nav">
                                <button class="navbar-toggler tm-bg-black py-2 px-3 mr-0 ml-auto collapsed" type="button"
                                        data-toggle="collapse" data-target="#navbar-nav" aria-controls="navbar-nav"
                                        aria-expanded="false" aria-label="Toggle navigation">
                                        <span>
                                            <i class="fas fa-bars tm-menu-closed-icon"></i>
                                            <i class="fas fa-times tm-menu-opened-icon"></i>
                                        </span>
                                </button>
                                <div class="collapse navbar-collapse tm-nav" id="navbar-nav">
                                    <ul class="navbar-nav text-uppercase">
                                        <li class="nav-item active">
                                            <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/">News</a>
                                        </li>
                                        <c:choose>
                                            <c:when test="${user.id==null}">
                                                <li class="nav-item">
                                                    <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/login">Login</a>
                                                </li>
                                            </c:when>

                                            <c:otherwise>
                                                <li class="nav-item">
                                                    <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/account">Account</a>
                                                </li>
                                            </c:otherwise>
                                        </c:choose>

                                        <li class="nav-item">
                                            <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/contact">Contact</a>
                                        </li>
                                        <c:if test="${user.id!=null}">
                                            <li class="nav-item">
                                                <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="tm-welcome-container tm-fixed-header tm-fixed-header-3">
        </div>

        <div id="tm-fixed-header-bg"></div> <!-- Header image -->
    </div>

    <main>
        <div class="mx-auto tm-content-container mt-4 px-3 mb-3">
            <div class="row">
                <div class="col-12">
                    <h2 class="tm-page-title mb-5 tm-text-primary">${nameNews.title}</h2>
                </div>
            </div>
            <c:forEach var="comments" items="${comments}">
            <div class="row">
                <div class="col-lg-6 mb-5 pt-3">
                    <div class="media tm-testimonial">

                        <img class="mr-4 rounded-circle img-fluid" src="../images/testimonial-1.jpg" alt="Generic placeholder image">

                        <p class="media-body pt-3 tm-testimonial-text">
                            ${comments.text}
                        </p>

                        <p>
                            <br>
                               Оставлено ${comments.me.username} в ${comments.date}
                        </p>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        <div class="mx-auto pb-3 tm-about-text-container px-3">
            <div class="row">
                <form>
                    <input class="btn btn-primary rounded-0 d-block ml-auto mr-0 tm-btn-animate tm-btn-submit tm-icon-submit" type="button" value="Написать" onClick='location.href="#addComment"'>
                </form>
            </div>
        </div>

        <div id="addComment" class="modalDialog">
            <div>
                <a href="${pageContext.request.contextPath}/node/${nameNews.id}" title="Закрыть" class="close">X</a>
                <h3>Напишите комментарии</h3>
                <form class="menu" method="post">
                    <textarea id="w3review" name="w3review" rows="4" cols="38">

                    </textarea>
                    <button name="addComment">
                        Оставить
                    </button>
                    <button name="cancel">
                        Отменить
                    </button>
                </form>
            </div>
        </div>

    </main>

    <footer class="row pt-5">
        <div class="col-12">
            <p class="text-right">Copyright&copy;2020 MaxTuT

                - Designed by <a href="https://templatemo.com" rel="nofollow" target="_parent">TemplateMo</a></p>
        </div>
    </footer>
</div>

</body>
</html>
