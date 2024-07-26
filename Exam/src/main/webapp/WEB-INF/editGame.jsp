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
		<a href="/homepage">Dashboard</a>
		<p class="text-danger">
			<c:out value="${error}"/>
		</p>
		<form:form action="/update/game/${game.id}" method="post" modelAttribute="game">
			<input type="hidden" name="_method" value="put" /> 
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" />
				<form:errors class="text-danger" path="name" />
			</div>
			<div>
				<form:label path="description">Description:</form:label>
				<form:input type="text" path="description" />
				<form:errors class="text-danger" path="description" />
			</div>
			<div>
				<form:label path="genre">Genre:</form:label>
				<form:input type="text" path="genre" />
				<form:errors class="text-danger" path="genre" />
			</div>
			<button>Submit</button>
		</form:form>
	</div>
</body>
</html>