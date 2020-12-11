<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 02.12.2020
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Слава Украине!!!
    ${kekek}     ${kekek.email}
    <form class="" method="post">
        <select class="form-control" id="contact-select" name="inquiry">
            <option value="-">Subject</option>
            <option value="sales">Sales &amp; Marketing</option>
            <option value="creative">Creative Design</option>
            <option value="uiux">UI / UX</option>
        </select>

        <button class="">
            Create
        </button>
    </form>


<%--    <form:form action="controllerName" method="POST" modelAttribute="meeting">--%>
<%--        <form:select path="country">--%>
<%--            <form:option value="NONE" label="Select" />--%>
<%--            <form:options items="${meetings}" />--%>
<%--        </form:select>--%>
<%--    </form:form>--%>

</body>
</html>
