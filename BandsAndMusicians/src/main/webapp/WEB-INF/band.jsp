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
		<h1>
			Name:
			<c:out value="${band.bandName}" />
		</h1>
		<h2>
			Genre:
			<c:out value="${band.genre}" />
		</h2>
		<c:forEach var="musician" items="${band.musicians}">
			<c:out value="${musician.name}"/>
		</c:forEach>

		<form action="/add/musician/to/${band.id}" method="post">
			<select name="musicianId">

				<c:forEach var="musician" items="${musicians}">

					<option value="${musician.id}"><c:out
							value="${musician.name}" /></option>

				</c:forEach>

			</select> <input type="submit" value="Add" />
		</form>
	</div>
</body>
</html>