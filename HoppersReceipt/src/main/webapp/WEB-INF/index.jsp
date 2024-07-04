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
		<h1>Hoppers Receipt</h1>
		<a href="/homepage">Home</a>
		<h2>
			Customer Name:
			<c:out value="${name}" />
		</h2>
		<p>
			Item Name:
			<c:out value="${itemName }" />
		</p>
		<p>
			Price: $
			<c:out value="${price }" />
		</p>
		<p>
			Description:
			<c:out value="${description }" />
		</p>
		<p>
			Vendor:
			<c:out value="${vendor }" />
		</p>

		<c:forEach var="oneDojo" items="${dojosFromMyController}">
			<p>
				<c:out value="${oneDojo}"></c:out>
			</p>
		</c:forEach>
		<img alt="Star Wars Meme" src="/images/mariogif.gif">
	</div>
</body>
</html>