<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- For JSTL Forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container text-center">
		<h1>
			Hello,
			<c:out value="${user.username }" />
		</h1>
		<a href="/logout">Logout</a>
		<h2>Current Games</h2>
		<h3>Games</h3>
		<hr>
		<c:forEach var="game" items="${games}">
			<div class="border border-2 border-primary">
				<a href="/view/game/${game.id}"> <c:out value="${game.name}" />
				</a>
				<h4>
					Genre:
					<c:out value="${game.genre}" />
				</h4>
			</div>
		</c:forEach>
		<a href="/new/game" class="btn btn-primary">Add A Game</a>
	</div>
</body>
</html>