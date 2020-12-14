<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${sessionScope.username != null}">
	<c:redirect url="logoutrequest"></c:redirect>
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="/CDN.html" %>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
<title>LOGOUT</title>
</head>
<body>
<jsp:include page="/nav.jsp"/>
<div class="container">
	<div class="pb-2 mt-4 mb-2 border-bottom">
	<h3>Logout utente</h3>
	</div>
	<div class="card">
		<div class="card-header">Info</div>
		<div class="card-body">
			<h5 class="card-title">Hai appena effettuato il logout</h5>
    		<p class="card-text">Per continuare a navigare all interno del sito è necessio il login</p>
    		<a href="loginform" class="btn btn-outline-dark">Login</a>
		</div>
	</div>
</div>
<footer class="footer"><%@include file="/footer.html"%></footer>
</body>
</html>









