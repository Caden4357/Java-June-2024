<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- <script type="text/javascript" src="/js/script.js"></script>
for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container border border-2 border-primary">
		<h1>Hello Spring Boot From JSP</h1>

		<h2>
			<c:out value="${day}" />
			<c:out value="${month}" />
			<c:out value="${year}" />
		</h2>

		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<!-- 
		// enhanced for loop
        for(String student : students){
            System.out.println(student);
        } 
-->
				<c:forEach var="student" items="${students}">
					<tr>
						<td><c:out value="${student}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<c:if test="${5==5}">
			<p>
				<c:out value="Equal" />
			</p>
		</c:if>
		<c:if test="${5==6}">
			<p>
				<c:out value="Not Equal" />
			</p>
		</c:if>
	</div>
</body>
</html>