<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Contact</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <div class="tm-welcome-container tm-fixed-header tm-fixed-header-3">
            <div class="text-center">
                <p class="pt-5 px-3 tm-welcome-text tm-welcome-text-2 mb-1 mt-lg-0 mt-5 text-white mx-auto">
                    Talk to Us<br>about any question you have
                </p>
            </div>
        </div>

        <div id="tm-fixed-header-bg"></div> <!-- Header image -->
    </div>
    <main>
        <div class="container-fluid px-0">
            <div class="mx-auto tm-content-container">
                <div class="row mt-3 mb-5 pb-3">
                    <div class="col-12">
                        <div class="mx-auto tm-about-text-container px-3">
                            <h2 class="tm-page-title mb-4 tm-text-primary">Свяжитесь с нашей командой</h2>
                            <p class="mb-4">
                                MaxTuT стремится стать ведущим СМИ. Мы старемся делать наш сайт более удобным, сообщать новости нашей страны.
                            </p>
                            <p class="mb-4">
                                Вы можете использовать форму ниже для задания вопросов.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="mx-auto pb-3 tm-about-text-container px-3">
                    <div class="row">
                        <div class="col-lg-6 mb-5">
                            <form id="contact-form" action="" method="post" class="tm-contact-form">
                                <div class="form-group">
                                    <input type="text" name="name" class="form-control rounded-0" placeholder="Name" required=""   />
                                </div>
                                <div class="form-group">
                                    <input type="email" name="email" class="form-control rounded-0" placeholder="Email" required=""  />
                                </div>
                                <div class="form-group">
                                    <textarea   rows="8" name="message" class="form-control rounded-0" placeholder="Message"
                                              required=""></textarea>
                                </div>
                                <div class="form-group mb-0">
                                    <button type="submit" class="btn btn-primary rounded-0 d-block ml-auto mr-0 tm-btn-animate tm-btn-submit tm-icon-submit"><span>Отправить</span></button>
                                </div>
                            </form>
                        </div>
                        <div class="col-lg-6">
                            <div class="mapouter mb-60">
                                <div class="gmap_canvas">
                                    <iframe width="100%" height="425" id="gmap_canvas"
                                            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3322.8755317103182!2d27.59193244491432!3d53.920589223861604!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x2ffffa160d78c41f!2z0JPQu9Cw0LLQvdGL0Lkg0LrQvtGA0L_Rg9GBINCR0J3QotCj!5e0!3m2!1sru!2sby!4v1608034656883!5m2!1sru!2sby"
                                            frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe>
                                </div>
                            </div>
                        </div>
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


</body>
</html>
