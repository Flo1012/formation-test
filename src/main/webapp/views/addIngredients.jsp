<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  header.jsp  -->
<jsp:include page="/inc/header.jsp" />


<!-- Contenu de la page -->
<div class="container">

	<h1>AJOUT D'UN INGREDIENT</h1>
	<c:url value="/ingredients/add.html" var="addUrl" />
	<form action="${addUrl}" method="POST">
		<label for="name">Nom : </label> <input id="name" name="name"
			class="form-control" /> <label for="state">Etat : </label> <input
			id="state" name="state" type="number" min="0" max="2"
			class="form-control" />
		<button>VALIDER</button>
	</form>

	<div
		style="position: fixed; bottom: 0; left: 0; padding: 20px; font-size: 18px;">
		<a href="<c:url value='/'  />">RETOUR</a>
	</div>

</div>


<!--  FOOTER.JSP -->
<jsp:include page="/inc/footer.jsp" />