<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrati</title>
<%@include file="/CDN.html"%>
</head>
<body>
<div class="container">
	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Registrati</h3>
	</div>
	<div class="col-sm-6">
		<form action="salvaUtente" method="post">
		<div class="form-group">
			<label for="nome">Username</label>
			<input type="text" name="username" placeholder="Username.." required
			class="form-control">
		</div>

		<div class="form-group">
			<label for="nome">Nascita</label>
			<input type="text" name="nascita" placeholder="Nascita.." required
			class="form-control">
		</div>

		<div class="form-group">
			<label for="reparto">Password</label>
			<input type="text" name="password" placeholder="Password.." required
			class="form-control">
		</div>

		<div class="row">
				<button type="submit" class="btn btn-outline-dark"
				style="margin-top: 20px; margin-left:15px;">Registrati</button>
				<a class="btn btn-outline-dark" 
				href="loginform" role="button" style="margin-top: 20px; margin-left:10px;">Login
				</a>
			</div>
		</form>
	</div>
</div>
</body>
</html>