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
<title>Statistiche</title>
<%@include file="/CDN.html"%>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>
<%@include file="/nav.jsp"%>
<div class="container">
	<div style="margin-top: 50px;"></div>
	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
			<li class="breadcrumb-item active" aria-current="page">Statistiche</li>
		</ol>
	</nav>
	<div style="margin-top: 30px;"></div>

	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Statistiche azienda</h3>
	</div>
	<div class="card mt-2">
	<div class="card-header">Impiegato con stipendio massimo</div>
	<div class="card-body">
		<table class="table table-borderless">
			<thead>
				<tr>
					<th style="width: 200px;">Immagine</th>
					<th style="width: 200px;">Id</th>
					<th style="width: 200px;">Nome</th>
					<th style="width: 200px;">Stipendio</th>
					<th style="width: 200px;">Reparto</th>
					<th style="width: 200px;">Modifica</th>
					<th style="width: 200px;">Cancella</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="impMax" value="${stipendioMax}"></c:set>
				<tr>
					<td class="mx-auto">
						<img src="<c:url value="/resources/img/${impMax.url_img}"/>"
						 class="img-thumbnail">
					</td>
					<td>${impMaxRep.id}</td>
					<td>${impMax.nome}</td>
					<td>${impMax.stipendio}</td>
					<td>${impMax.reparto}</td>
					<td><button type="button" class="btn btn-warning btn-sm"
							onclick="window.location.href='modificatemp/${impMax.id}'">Modifica</button></td>
					<td><button type="button" class="btn btn-danger btn-sm"
							onclick="window.location.href='cancella/${impMax.id}'">Elimina</button></td>
				</tr>
			</tbody>
		</table>
	</div>
	</div>
	<div class="card mt-2">
	<div class="card-header">Impiegato con stipendio massimo per reparto</div>
	<div class="card-body">
		<c:forEach items="${lista2}" var="impMaxRep">
			<div class="border-bottom">
				<h5>${impMaxRep.reparto}</h5>
			</div>
			<table class="table table-borderless">
				<thead>
					<tr>
						<th style="width: 200px;">Immagine</th>
						<th style="width: 200px;">Id</th>
						<th style="width: 200px;">Nome</th>
						<th style="width: 200px;">Stipendio</th>
						<th style="width: 200px;">Modifica</th>
						<th style="width: 200px;">Cancella</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td class="mx-auto">
							<img src="<c:url value="/resources/img/${impMaxRep.url_img}"/>"
							 class="img-thumbnail">
						</td>
						<td>${impMaxRep.id}</td>
						<td>${impMaxRep.nome}</td>
						<td>${impMaxRep.stipendio}</td>
						<td><button type="button" class="btn btn-warning btn-sm"
								onclick="window.location.href='modificatemp/${impMaxRep.id}'">Modifica</button></td>
						<td><button type="button" class="btn btn-danger btn-sm"
								onclick="window.location.href='cancella/${impMaxRep.id}'">Elimina</button></td>
					</tr>
				</tbody>
			</table>
		</c:forEach>
	</div>
	</div>

	<div class="card mt-2">
	<div class="card-header">Media stipendi per reparto</div>
	<div class="card-body">
		<table class="table">
			<thead>
				<tr>
					<th style="width: 200px;">Reparto</th>
					<th style="width: 200px;">Media Stipendio</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${lista1}" var="imp">
				<tr>
					<td>${imp.reparto}</td>
					<td>${imp.stipendio}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	
	<div class="row">
		<button type="button" class="btn btn-outline-dark"
			onclick="window.location.href='impreport'" style="margin-top: 20px;">Report impiegati</button>
		<button type="button" class="btn btn-outline-dark"
			onclick="window.location.href='impform'" style="margin-top: 20px; margin-left: 10px;">Aggiungi un nuovo impiegato</button>
	</div>
</div>
<footer class="footer"><%@include file="/footer.html"%></footer>
</body>
</html>