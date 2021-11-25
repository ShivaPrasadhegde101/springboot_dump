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
<h2 id="regid">Welcome to Registration Page.. </h2>
<form:form name="studentform" action="/registration" method="post" modelAttribute="student">
<table>
<tr><td><form:label path="firstName">First Name:</form:label></td>
<td><form:input path="firstName" id="firstName" name="firstName"/></td>
<td><form:errors path="firstName"/></td></tr>

<tr><td><form:label path="lastName">Last Name:</form:label></td>
<td><form:input path="lastName" id="lastName" name="lastName"/></td>


<tr><td><form:label path="dept.deptName">Department:</form:label></td>
<td><form:select path="dept.deptName" id="deptName" name="deptName">
<form:option value="CSE" label="CSE"/>
<form:option value="EEE" label="EEE"/>
<form:option value="IT" label="IT"/>
<form:option value="MECH" label="MECH"/>
<form:option value="ECE" label="ECE"/>
</form:select></td>


<tr><td><form:label path="email">Email id:</form:label></td>
<td><form:input path="email" id="email" name="email"/></td>
<td><form:errors path="email"></form:errors></td></tr>

<tr>
<td><input type="submit" value="submit" id="submit" name="submit"></td>
<td><input type="reset" value="Clear" id="Clear" name"Clear"></td>
</tr>
</table>

</form:form>
</body>
</html>