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
		<h1>Restaurants</h1>
		<div class="d-flex justify-content-between mt-5">
			<c:forEach var="restaurant" items="${restaurants}">
				<div class="w-1/4 border border-2 border-success p-2">
					<h2>
						<a href="/restaurant/${restaurant.id}"> Name: <c:out
								value="${restaurant.name}" />
						</a>
					</h2>
					<h2>
						Cuisine:
						<c:out value="${restaurant.cuisine}" />
					</h2>
					<h2>
						Rating:
						<c:out value="${restaurant.rating}" />
					</h2>
					<h2>
						Open?:
						<c:out value="${restaurant.isOpen}" />
					</h2>
					<a href="/edit/restaurant/${restaurant.id}">Edit</a>
				</div>
			</c:forEach>
		</div>
		<h2>Add Your Favorite Restaurant</h2>
		<c:if test="${not empty errorMessages}">
			<div class="error">
				<ul>
					<c:forEach var="errorMessage" items="${errorMessages}">
						<li>${errorMessage}</li>
					</c:forEach>
				</ul>
			</div>
		</c:if>
		<form:form action="/create/restaurant" method="post"
			modelAttribute="rest">
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