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
		<h2>
			Name:
			<c:out value="${team.name}" />
		</h2>
		<h2>
			City:
			<c:out value="${team.city}" />
		</h2>
		<h2>
			State:
			<c:out value="${team.state}" />
		</h2>

		<h3>Players:</h3>
		<c:forEach var="player" items="${team.players}">
			<p>
				Name:
				<c:out value="${player.name}" />
			</p>
		</c:forEach>

		<h3>Coaches:</h3>
		<c:forEach var="coach" items="${team.coaches}">
			<p>
				Name:
				<c:out value="${coach.name}" />
			</p>
		</c:forEach>
	</div>
</body>
</html>