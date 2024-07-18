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
		<h1>Authentication</h1>
		<h2>Register</h2>
		<form:form action="/register/user" method="post"
			modelAttribute="newUser">
			<p>
				<form:label path="firstName">First Name</form:label>
				<form:errors class="text-danger" path="firstName" />
				<form:input class="w-100" path="firstName" />
			</p>
			<p>
				<form:label path="lastName">Last Name</form:label>
				<form:errors class="text-danger" path="lastName" />
				<form:input class="w-100" path="lastName" />
			</p>
			<p>
				<form:label path="email">Email</form:label>
				<form:errors class="text-danger" path="email" />
				<form:input class="w-100" path="email" />
			</p>
			<p>
				<form:label path="password">Password</form:label>
				<form:errors class="text-danger" path="password" />
				<form:input class="w-100" path="password" type="password"/>
			</p>
			<p>
				<form:label path="confirm">Confirm Password</form:label>
				<form:errors class="text-danger" path="confirm" />
				<form:input class="w-100" path="confirm" type="password"/>
			</p>
			<button>Register</button>
		</form:form>
	</div>
</body>
</html>