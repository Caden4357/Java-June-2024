<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- For JSTL Forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div>
		<h1>Edit Burger</h1>
		<form:form action="/update/burger/${burger.id}" method="post" modelAttribute="burger">
			<input type="hidden" name="_method" value="put"/>
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