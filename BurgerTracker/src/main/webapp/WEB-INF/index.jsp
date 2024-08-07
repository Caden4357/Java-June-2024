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
		<h1>Burger Tracker</h1>
		<table class="table table-dark">
			<tr>
				<th>Name</th>
				<th>Restaurant</th>
				<th>Rating</th>
				<th>Notes</th>
				<th>Action</th>
			</tr>
			<c:forEach var="burger" items="${burgers}">
				<tr>
					<td><c:out value="${burger.name}" /></td>
					<td><c:out value="${burger.restaurant}" /></td>
					<td><c:out value="${burger.rating}" /></td>
					<td><c:out value="${burger.notes}" /></td>
					<td>
						<a href="/edit/burger/${burger.id}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<form:form action="/create/burger" method="post" modelAttribute="burger">
			<form:label path="name">Name:</form:label>
			<form:input path="name" />
			<form:errors path="name" class="text-danger"/>
			<form:label path="restaurant">restaurant:</form:label>
			<form:input path="restaurant" />
			<form:errors path="restaurant" class="text-danger"/>
			<form:label path="rating">rating:</form:label>
			<form:input path="rating" type="number"/>
			<form:errors path="rating" class="text-danger"/>
			<form:label path="notes">notes:</form:label>
			<form:input path="notes" />
			<form:errors path="rating" class="text-danger"/>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>