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
		<h1>Add A Player</h1>
		<form:form action="/create/player" method="post"
			modelAttribute="player">
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" />
				<form:errors class="text-danger" path="name" />
			</div>
			<div>
				<form:label path="position">Position:</form:label>
				<form:input type="text" path="position" />
				<form:errors class="text-danger" path="position" />
			</div>
			<div>
				<form:label path="age">Age:</form:label>
				<form:input type="number" path="age" />
				<form:errors class="text-danger" path="age" />
			</div>
			<div>
				<form:select path="team">
					<c:forEach var="team" items="${teams}">
						<option value="${team.id}"><c:out value="${team.name}"/></option>
					</c:forEach>
				</form:select>
			</div>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>