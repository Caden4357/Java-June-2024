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
		<h1>Restaurants</h1>
		<c:forEach var="restaurant" items="${restaurants}">
			<h2>Name: <c:out value="${restaurant.name}"/></h2>
			<h2>Cuisine: <c:out value="${restaurant.cuisine}"/></h2>
			<h2>Rating: <c:out value="${restaurant.rating}"/></h2>
			<h2>Open?: <c:out value="${restaurant.isOpen}"/></h2>
		</c:forEach>
	</div>
</body>
</html>