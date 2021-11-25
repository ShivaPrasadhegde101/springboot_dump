<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Issue Details</title>
<style type="text/css">
	.error{
		color: red;
		font-style: italic;
	}
</style>
</head>
<body>
<h2 id="detailid">Details Saved Successfully.. </h2>
<table>
<tr>
<th>ID:</th>
<td>${student.getSId()}</th></tr>
<tr>
<th>First Name:</th>
<td>${student.getFirstName()}</td></tr>

<tr><th>Last Name:</th>
<td>${student.getLastName()}</td></tr>

<tr>
<th>Department:</th>
<td>${student.getDept().getDeptName()}</td>
</tr>

<tr><th>Email id:</th>
<td>${student.getEmail()}</td>
</tr>



</table>

</body>
</html>