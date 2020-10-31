
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: m0hit
  Date: 30/10/20
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<h1>Student is ${student.firstName} ${student.lastName}</h1>
<br>
<b>${student.country}</b>  <b>${student.location}</b>
<ul>
    Operating System :
    <c:forEach var="job" items="${student.operatingSystem}">
        <li>${job}</li>
    </c:forEach>
</ul>
</body>
</html>
