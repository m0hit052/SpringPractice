<%--
  Created by IntelliJ IDEA.
  User: m0hit
  Date: 30/10/20
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Show Form Page</title>
</head>
<body>
    <form:form action="/SringMVCdemo_war_exploded/student/processform" modelAttribute="student">
        First Name : <form:input path="firstName"/>
        <br>
        Last Name : <form:input path="lastName"/>
        <br>
        Country : <form:select path="country" items="${student.countryOptions}"/>

        <br>
        Job Location :  <form:radiobuttons path="location" items="${student.jobLocation}"/>
        <br>
        Operating System :
        Linux :<form:checkbox path="operatingSystem" value="Linux" />
        MacOs : <form:checkbox path="operatingSystem" value="MacOs" />
        Windows : <form:checkbox path="operatingSystem" value="Windows" />

        <input type="submit" name="Submit">

    </form:form>
</body>
</html>
