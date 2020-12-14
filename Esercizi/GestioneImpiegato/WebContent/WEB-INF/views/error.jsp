<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Errore!</title>
<%@include file="/CDN.html" %>
</head>
<body>
<%@include file="/nav.jsp" %>
<div class="container">
<div class="pb-2 mt-4 mb-2 border-bottom">
	<h3>Compilazione non riuscita</h3>
</div>
<div class="card">
	<div class="card-header text-white bg-danger mb-3">
	<h3>Errore nella compilazione della pagina</h3>
	</div>
	<div class="card-body">
	<h5 class="card-title">Gestore eccezioni interno</h5>
	<p class="card-text">Exception: ${exception.message}</p>
	<c:forEach items="${exception.stackTrace}" var="st">
		${st}
	</c:forEach>
	
	<p style="margin-top:20px;">
		<input type="button" class="btn btn-primary" value="Indietro" 
		onclick="window.history.back()">
	</p>
</div>
</div>
</div>
</body>
</html>