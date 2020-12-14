<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-xl navbar-dark bg-dark">
	<a class="navbar-brand"
		href="${pageContext.request.contextPath}/index.jsp">Home</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#mioMenu">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="mioMenu">

		<c:choose>
			<c:when test="${sessionScope.username == null}">
				<ul class="navbar-nav ml-auto">
					<li style="margin-left: 10px;"><a href="registraUtenteform"
						class="btn btn-sm btn-outline-warning mr-sm-2" type="button">
							<span class="glyphicon glyphicon-user"></span>Sing-up
					</a></li>
					<li><a href="loginform"
						class="btn btn-sm btn-outline-warning my-2 my-sm-0" type="button">
							<span class="glyphicon glyphicon-log-in"></span>Sing-in
					</a></li>
				</ul>
			</c:when>


			<c:when test="${sessionScope.username != null}">
				<ul class="nav navbar-nav">
					<li><a class="nav-item nav-link"
						href="${pageContext.request.contextPath}/impform">Aggiungi
							Impiegato</a></li>
					<li><a class="nav-item nav-link"
						href="${pageContext.request.contextPath}/impreport">Report
							Impiegati</a></li>
					<li><a class="nav-item nav-link" href="statistiche">Statistiche</a></li>
				</ul>

				<ul class="navbar-nav ml-auto" style="margin-right: 30px">
					<li class="dropdown"><a href="#"
						class="dropdown-toggle btn btn-sm btn-outline-warning mr-sm-2"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						type="button" aria-expanded="false"><span
							class="glyphicon glyphicon-user"></span>${sessionScope.username}</a>
						<ul class="dropdown-menu">
							<li><a href="#">Profilo</a></li>
							<li><a href="#">Modifica Profilo</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">About Us</a></li>
						</ul></li>
					<li><button type="button" class="btn btn-outline-warning btn-sm" data-toggle="modal" data-target="#askLogout">Logout</button></li>
				</ul>

				<!-- Modal Logout -->
				<div class="modal fade" id="askLogout" tabindex="-1" role="dialog"
					aria-labelledby="askLogoutTitle" aria-hidden="true">
					<div class="modal-dialog modal-dialog-centered" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="askLogoutLongTitle">Confermare
									logout</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">Necessario confermare il logout</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Chiudi</button>
								<a href="logoutrequest" type="button" class="btn btn-outline-warning">Logout</a>
							</div>
						</div>
					</div>
				</div>


			</c:when>
		</c:choose>
	</div>
</nav>