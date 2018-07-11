
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details of Student are...</title>
</head>
<body>

	<h3>Details of Student are...</h3>
	<table border="1">
		<tr>
		<th>ID</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>EMAIL</th>
			<th>PHONE</th>
			<th>CITY</th>
			<th>STATE</th>
			<th>COURSE</th>
		</tr>
		<c:forEach items="${student}" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.firstname}</td>
				<td>${p.lastname}</td>
				<td>${p.email}</td>
				<td>${p.phone}</td>
				<td>${p.city}</td>
				<td>${p.state}</td>
				<td>${p.course}</td>
				<td>
			<a href="EditServlet?id=${p.id}">Edit</a> 
			<a href="./delete-person?id=${p.id}">Delete</a></td>
			
		</c:forEach>
	</table>
<br>
<br>
<form action="index.html">
<button> GO HOME</button>
</form>





</body>
</html>