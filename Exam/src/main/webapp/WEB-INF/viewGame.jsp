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
			<c:out value="${game.name}" />
		</h1>
		<a href="/homepage">Dashboard</a>
		<p>
			Name:
			<c:out value="${game.name}" />
		</p>
		<p>
			Developer:
			<c:out value="${game.user.username}" />
		</p>
		<p>
			Genre:
			<c:out value="${game.genre}" />
		</p>
		<p>
			Description:
			<c:out value="${game.description}" />
		</p>
		<c:if test="${userId == game.user.id}">
			<a href="/edit/game/${game.id}" class="btn btn-secondary">Edit</a>
			<form action="/delete/game/${game.id}" method="post">
				<input type="hidden" name="_method" value="delete" /> <input
					type="submit" value="Delete" class="btn btn-danger" />
			</form>
		</c:if>

		<form:form action="/create/suggestion/${game.id}" method="post"
			modelAttribute="suggestion">
			<div>
				<form:label path="post">Suggestion:</form:label>
				<form:input type="text" path="post" />
				<form:errors class="text-danger" path="post" />
			</div>
			<button>Comment</button>
		</form:form>
		<c:forEach var="suggestion" items="${game.suggestions}">
			<p>
				<c:out value="${suggestion.user.username} Says: ${suggestion.post}" />
			</p>
		</c:forEach>
	</div>
</body>
</html>