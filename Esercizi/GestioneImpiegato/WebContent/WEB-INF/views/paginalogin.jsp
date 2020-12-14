<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<%@include file="/CDN.html"%>
</head>
<body>
<div class="container">
	<div class="pb-2 mt-4 mb-2 border-bottom">
		<h3>Login</h3>
	</div>
	<div class="col-sm-6">
		<form action="login" method="post">
			<div class="form-group">
				<label for="nome">Username</label>
				<input type="text" name="username" placeholder="Username.." required
				class="form-control">
			</div>
	
			<input type="hidden"  value="11/02/1998" name="nascita" placeholder="Nascita.." required>
	
			<div class="form-group">
				<label for="reparto">Password</label>
				<input type="text" name="password" placeholder="Password.." required
				class="form-control">
			</div>
	
			<div class="row">
				<button type="submit" class="btn btn-outline-dark"
				style="margin-top: 20px; margin-left:15px;">Login</button>
				<a class="btn btn-outline-dark" 
				href="registraUtenteform" role="button" style="margin-top: 20px; margin-left:10px;">Registrati
				</a>
			</div>
		</form>
	</div>
</div>
</body>
</html>