<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Errore 404</title>
<%@include file="/CDN.html"%>
</head>
<body>
<%@include file="/nav.jsp"%>
<div class="container">
	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Pagina non trovata</h3>
	</div>
	
	<div class="card">
		<div class="card-header text-white bg-danger mb-3">
			<h3>Impossibile caricare la risorsa richiesta</h3>
		</div>
		<div class="card-body">
		<h5 class="card-title">Siamo spiacenti del disagio risolveremo al più presto</h5>
		<p class="card-text">Per segnalare il provlema: &nbsp; <a href="mailto:admin@betacom.com">admin@betacom.com</a>
		<p style="margin-top: 20px;">
			<input type="button" class="btn btn-primary" value="Indietro" onclick="window.history.back()">
			</p>
		</div>
	</div>
</div>
</body>
</html>