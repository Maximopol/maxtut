<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Video Catalog</title>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet">
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
                                        <li class="nav-item">
                                            <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/">News</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/account">Account</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link tm-nav-link" href="${pageContext.request.contextPath}/kek">Contact</a>
                                        </li>
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

    <!-- Page content -->
    <main>
        <div class="container-fluid px-0">
            <div class="mx-auto tm-content-container">
                <div class="row mt-3 mb-5 pb-3">
                    <div class="col-12">
                        <div class="mx-auto tm-about-text-container px-3">
                            <h2 class="tm-page-title mb-4 tm-text-primary">${news.title}</h2>
                            <p class="mb-4">
                                ${news.myFile.text}
                            </p>
                            <p class="media-body pt-3 tm-testimonial-text">
                                Создано: ${news.date}. Автор: ${news.employment.user.username}
                            </p>
                        </div>
                    </div>
                </div>
                <div class="mx-auto pb-3 tm-about-text-container px-3">
                    <div class="row">
                        <form action="${pageContext.request.contextPath}/node/${news.id}" target="_blank" method="get">
                            <button type="submit" class="btn btn-primary rounded-0 d-block ml-auto mr-0 tm-btn-animate tm-btn-submit tm-icon-submit"><span>65 комментрариев, перейти к обсуждению статьи на форуме</span></button>
                        </form>
                    </div>
                </div>
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
</div>

<script src="../js/jquery-3.4.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/parallax.min.js"></script>
</body>
</html>