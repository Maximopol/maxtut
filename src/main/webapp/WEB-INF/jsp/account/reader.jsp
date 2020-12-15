<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My account</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--    <link rel="stylesheet" href="fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->--%>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <!-- https://fonts.google.com/ -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/templatemo.css">
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
                            <h1 class="tm-site-name">Video Catalog</h1>
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
                                            <a class="nav-link tm-nav-link" href="#">News <span class="sr-only">(current)</span></a>
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
        <div class="tm-welcome-container tm-fixed-header tm-fixed-header-1">
            <div class="text-center">
                <p class="pt-5 px-3 tm-welcome-text tm-welcome-text-2 mb-1 text-white mx-auto">Hello ${user.username}!</p>
            </div>
        </div>

        <!-- Header image -->
        <div id="tm-fixed-header-bg"></div>
    </div>

    <!-- Page content -->
    <div class="container-fluid">
        <div class="mx-auto tm-content-container">
            <main>

                <div class="mx-auto tm-content-container mt-4 px-3 mb-3">
                    <div class="row">
                        <div class="col-lg-6 mb-5 pt-3">
                            <div class="media tm-testimonial">
                                <img class="mr-4 rounded-circle img-fluid" src="../image/testimonial-1.jpg" alt="Generic placeholder image">
                                <p class="media-body pt-3 tm-testimonial-text">
                                    Ваша почта: ${user.email}
                                    <br>Вы зашли на сайт как читатель.
                                    <br>Вы можете предлагать новости, просмотривать и комментировать их.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>

            </main>
            <div class="row mt-5 pt-3">
                <div class="col-xl-6 col-lg-12 mb-4">
                    <div class="tm-bg-gray p-5 h-100">
                        <h3 class="tm-text-primary mb-3">Ваши последние комментарии</h3>
                        <c:forEach var="commentList" items="${commentList}">
                            <p class="mb-5">
                                <a href="${pageContext.request.contextPath}/node/${commentList.news}"  >
                                        ${commentList.text}
                                </a>
                            </p>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <footer class="row pt-5">
                <div class="col-12">
                    <p class="text-right">Copyright&copy;2020 MaxTuT

                        - Designed by <a href="https://templatemo.com" rel="nofollow" target="_parent">TemplateMo</a></p>
                </div>
            </footer>
        </div> <!-- .tm-content-container -->
    </div>
</div>

<script src="../js/jquery-3.4.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script>
    $(document).ready(function() {
        $('.tm-likes-box').click(function(e) {
            e.preventDefault();
            $(this).toggleClass('tm-liked');

            if($(this).hasClass('tm-liked')) {
                $('#tm-likes-count').html('486 likes');
            } else {
                $('#tm-likes-count').html('485 likes');
            }
        });
    });
</script>
</body>
</html>