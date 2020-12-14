<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${sessionScope.username == null}">
	<c:redirect url="loginform"></c:redirect>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@include file="/CDN.html"%>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>
<%@include file="/nav.jsp"%>
<div class="container">
	<div class="jumbotron" style="border-top: 50px">
		<h1 class="display-4">Gestione impiegati</h1>
		<p class="lead">Console di amministrazione</p>
		<hr>
		<a class="btn btn-outline-dark btn-lg" 
		href="impreport" role="button">Report Impiegati
		</a>
	</div>
</div>
<footer class="footer"><%@include file="footer.html" %></footer>
</body>
</html>