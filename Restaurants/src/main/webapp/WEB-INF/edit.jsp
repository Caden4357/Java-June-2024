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
	<div>
		<h1>Edit</h1>
		<form:form action="/update/restaurant/${restaurant.id}" method="post"
			modelAttribute="restaurant">
			<input type="hidden" name="_method" value="put"/>
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" />
				<form:errors class="text-danger" path="name" />
			</div>
			<div>
				<form:label path="cuisine">Cuisine:</form:label>
				<form:input type="text" path="cuisine" />
				<form:errors class="text-danger" path="cuisine" />
			</div>
			<div>
				<form:label path="rating">Rating:</form:label>
				<form:input type="number" path="rating" />
				<form:errors class="text-danger" path="rating" />
			</div>
			<div>
				<form:label path="isOpen">Is Open:</form:label>
				<form:checkbox path="isOpen" />
				<form:errors class="text-danger" path="isOpen" />
			</div>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>