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
		<h1>Forms & Session In Spring</h1>
		<h2>Count: <c:out value="${count}"/></h2>
		<form action="/increment" method="post">
			<button>Increment++</button>
		</form>
		<form action="/reset/count" method="post">
			<button>Reset</button>
		</form>
		
		<form action="/favorite/character" method="post">
			<input name="name" type="text" placeholder="Enter name "/>
			<input name="universe" type="text" placeholder="Enter Universe"/>
			<input name="age" type="number" placeholder="Age"/>
			<input name="superPower" type="text" placeholder="Special Ability"/>
			<input type="submit" value="Submit"/>
			<!-- <button>Submit</button> -->
		</form>
	</div>
</body>
</html>