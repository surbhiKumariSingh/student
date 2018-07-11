<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration</title>
<style type="text/css">

label {
	display: inline-block;
	width: 100px;
	text-align: right;
}
</style>
</head>
<body>
	<h1>EDIT DETAILS</h1>
	<form action="index.html">
	<p>click here to go home <button> GO HOME</button></p>
	<hr>
	</form>
	<br>
	<h3>${title==null? "Edit person details" : title}</h3>
	
	<form  action='${student!=null?"./UpdateStudent":"./UpdateStudent"}' method="POST" >
	<input type="hidden" name="id" value="${student.id}"> 
	<label	for="fname">First Name</label> 
	<input type="text" id="fname"	name="firstname" placeholder="firstname"	value="${student.firstname}"> <br><br>
   
    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="lastname" value="${student.lastname}"><br><br>
    
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="email" value="${student.email }"><br><br>
    
    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="phone" value="${student.phone}"><br><br>
    
    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="city" value="${student.city }"><br><br>
    
    <label for="state">State</label>
    <input type="text" id="state" name="state" placeholder="state" value="${student.state}"><br><br>
    
    <label for="course">Course</label>
    <input type="text" id="course" name="course" placeholder="course" value="${student.course }"><br><br>
  
     <input type="submit"  style="float:left"   value=" Submit"><br><br>
    
 
    
</form>	
   <form action="index.html">
	<button> Cancel</button>
	</form>
</body>
</html>