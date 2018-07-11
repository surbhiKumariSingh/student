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
	<h1>ENTER STUDENT DETAILS</h1>
	<form action="index.html">
	<p>click here to go home <button> GO HOME</button></p>
	<hr>
	</form>
	<br>

	<form action="AddStudent"  method="post">
	
	<label	for="fname">First Name</label> 
	<input type="text" id="fname"	name="firstname" placeholder="firstname"	> <br><br>
   
    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="lastname" ><br><br>
    
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="email" ><br><br>
    
    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="phone" ><br><br>
    
    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="city" ><br><br>
    
    <label for="state">State</label>
    <input type="text" id="state" name="state" placeholder="state" ><br><br>
    
    <label for="course">Course</label>
    <input type="text" id="course" name="course" placeholder="course" ><br><br>
  
     <input type="submit"  style="float:left"   value=" Submit"><br><br>
    
 
    
</form>	
   <form action="index.html">
	<button> Cancel</button>
	</form>
</body>
</html>