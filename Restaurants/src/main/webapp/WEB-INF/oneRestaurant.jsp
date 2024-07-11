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
		<a class="btn btn-primary" href="/">Home</a>
		<h1><c:out value="${restaurant.name}"/></h1>
		<h2>Cuisine: <c:out value="${restaurant.cuisine}"/></h2>
		<h2>Rating: <c:out value="${restaurant.rating}"/></h2>
		<h2>Is Open: <c:out value="${restaurant.isOpen}"/></h2>
		
		<form action="/delete/restaurant/${restaurant.id}" method="post">
			<input type="hidden" name="_method" value="delete"/>
			<input type="submit" value="Delete" class="btn btn-danger"/>
		</form>
	</div>
</body>
</html>