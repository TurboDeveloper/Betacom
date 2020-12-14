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
<title>Report impiegati</title>
<%@include file="/CDN.html"%>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>
<%@include file="/nav.jsp"%>
<div class="container">
	<div style="margin-top: 50px;"></div>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a
				href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
			<li class="breadcrumb-item active" aria-current="page">Report impiegati</li>
		</ol>
	</nav>
	<div style="margin-top: 30px;"></div>

	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Reporti impiegati inseriti</h3>
	</div>
	<table class="table table-borderless">
		<thead>
			<tr>
				<th style="width: 200px;">Immagine</th>
				<th style="width: 200px;">Nome</th>
				<th style="width: 200px;">Stipendio</th>
				<th style="width: 200px;">Reparto</th>
				<th style="width: 200px;">Modifica</th>
				<th style="width: 200px;">Cancella</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="imp" items="${lista}">
				<tr>
					<td class="mx-auto">
						<img src="<c:url value="/resources/img/${imp.url_img}"/>"
						 class="img-thumbnail">
					</td>
					<td>${imp.nome}</td>
					<td>${imp.stipendio}</td>
					<td>${imp.reparto}</td>
					<td><button type="button" class="btn btn-warning btn-sm"
							onclick="window.location.href='modificatemp/${imp.id}'">Modifica</button></td>
					<td><button type="button" class="btn btn-danger btn-sm"
							onclick="window.location.href='cancella/${imp.id}'">Elimina</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button type="button" class="btn btn-outline-dark"
		onclick="window.location.href='impform'" style="margin-top: 20px;">Aggiungi
		un nuovo impiegato</button>
</div>
<footer class="footer"><%@include file="/footer.html"%></footer>
</body>
</html>