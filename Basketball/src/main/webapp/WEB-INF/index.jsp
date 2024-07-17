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
		<h1>Basketball</h1>
		<a href="/new/player">Add A Player</a>
		<div class="d-flex justify-content-between mt-5">
			<c:forEach var="team" items="${teams}">
				<div class="w-1/4 border border-2 border-success p-2">
					<h2>
					<a href="/team/${team.id}">
						Name:
						<c:out value="${team.name}" />
					</a>
					</h2>
					<h2>
						City:
						<c:out value="${team.city}" />
					</h2>
					<h2>
						State:
						<c:out value="${team.state}" />
					</h2>
				</div>
			</c:forEach>
		</div>
		<h2>Add A Team</h2>
		<form:form action="/create/team" method="post"
			modelAttribute="team">
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" />
				<form:errors class="text-danger" path="name" />
			</div>
			<div>
				<form:label path="city">City:</form:label>
				<form:input type="text" path="city" />
				<form:errors class="text-danger" path="city" />
			</div>
			<div>
				<form:label path="state">State:</form:label>
				<form:input type="text" path="state" />
				<form:errors class="text-danger" path="state" />
			</div>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>