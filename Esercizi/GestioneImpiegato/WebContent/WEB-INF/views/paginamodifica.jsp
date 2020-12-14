<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${sessionScope.username == null}">
	<c:redirect url="loginform"></c:redirect>
</c:if>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica impiegato</title>
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
			<li class="breadcrumb-item"><a
				href="${pageContext.request.contextPath}/impreport">Report
					impiegati</a></li>
			<li class="breadcrumb-item active" aria-current="page">Modifica
				impiegato</li>
		</ol>
	</nav>

	<div style="margin-top: 30px;"></div>

	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Modifica i dati dell'impiegato</h3>
	</div>

	<form:form action="${pageContext.request.contextPath}/modifica"
		method="post">
		<table class="table table-borderless">
			<thead>
				<tr>
					<th style="width: 200px;">Nome</th>
					<th style="width: 200px;">Stipendio</th>
					<th style="width: 200px;">Reparto</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<form:hidden path="id" />
					<td><form:input path="nome" class="form-control" /></td>
					<td><form:input path="stipendio" class="form-control" /></td>
					<td><form:input path="reparto" class="form-control" /></td>
				</tr>
				<tr>
					<td colspan="3">
						<button type="submit" class="btn btn-danger">Modifica</button>
				<tr>
			</tbody>
		</table>
	</form:form>
</div>
<footer class="footer"><%@include file="/footer.html"%></footer>
</body>
</html>