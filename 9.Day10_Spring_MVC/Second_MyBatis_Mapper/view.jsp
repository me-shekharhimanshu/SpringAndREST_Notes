<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
<h1>Students added are</h1>
	<table border="1">
	<tr>
		<th align="left">Rollno</th>
		<th align="left">Name</th>
		<th align="left">Age</th>
	</tr>
	<c:forEach var="student"  items="${mylist}">
		<tr>
			<td> ${student.rollno}</td>
			<td> ${student.name}</td>
			<td> ${student.age}</td>
		</tr>
		</c:forEach>
	</table>
	
	<br><br><br>
	<a href="new_student.do">Add More Students</a>
</body>
</html>



