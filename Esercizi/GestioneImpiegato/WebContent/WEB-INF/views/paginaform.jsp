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
<title>Aggiungi utente</title>
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
			<li class="breadcrumb-item active" aria-current="page">Inserimento
				Impiegato</li>
		</ol>
	</nav>
	<div style="margin-top: 30px;"></div>

	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Inserire i dati dell'impiegato</h3>
	</div>

	<div class="col-sm-6">
		<form:form action="salva" method="post" class="form-horizontal"
			modelAttribute="impiegato" enctype="multipart/form-data">
			<div class="form-group row">
				<label for="stipendio" class="col-sm-2 col-form-label mr-2">Nome</label>
				<div class="col-sm-4">
					<form:input path="nome" placeholder="Nome.."
						class="form-control"></form:input>
				</div>
				<div class="col-sm-6">
					<form:errors path="nome" cssClass="error"></form:errors>
				</div>
			</div>
	<div class="form-group row">
	<label for="stipendio" class="col-sm-2 col-form-label mr-2">Stipendio</label>
	<div class="col-sm-4">
		<form:input path="stipendio" value=""
			placeholder="Stipendio..."
			class="form-control"/>
	</div>
	<div class="col-sm-6">
		<form:errors path="stipendio" cssClass="error"/>
	</div>
	</div>
	
	<div class="form-group row">
	<label for="stipendio" class="col-sm-2 col-form-label mr-2">Reparto</label>
	<div class="col-sm-4">
		<form:input path="reparto"
			placeholder="Reparto..."
			class="form-control"/>
	</div>
	<div class="col-sm-6">
		<form:errors path="reparto" cssClass="error"/>
	</div>
	</div>
	
	<div class="form-group row">
		<label for="file" class="col-sm-2 col-form-label mr-2">Immagine profilo</label>
		<div class="col-sm-4">
			<input type="file" name="file" />
			<form:input path="url_img" type="hidden" value=""/>
		</div>
		<div class="col-sm-6">
			<form:errors path="url_img" cssClass="error"/>
		</div>
	</div>
	
			<button type="submit" class="btn btn-outline-dark"
				style="margin-top: 20px">Registra Impiegato</button>
		</form:form>
	</div>
</div>
<footer class="footer"><%@include file="/footer.html"%></footer>
</body>
</html>