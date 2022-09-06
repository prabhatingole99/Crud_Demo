<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>register</title>
</head>
<body>
	<center>
		<h3>Student Form</h3>
		<spring:url value="/student/saveStudent" var="save"> </spring:url>	
		<pre>
		<table border="2px">
			<form:form action="${save}" method="post" modelAttribute="std">
				
				
				<tr>
					<th>Id :</th>
					<td><form:input path="Id" /></td>
				</tr>
					
				<tr>
				<th>First Name :</th>
					<td><form:input path="firstName"/></td>
				</tr>
				
				<tr>
				<th>Last Name :</th>
					<td><form:input path="lastName"/></td>
				</tr>
				
				<tr>
				<th>Address :</th>
					<td><form:input path="Address"/></td>
				</tr>
				
				<tr>
				<th>Mobile Number :</th>
					<td><form:input path="mobileNo"/></td>
				</tr>

				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</form:form>
		</table>
	</pre>
	</center>
</body>
</html>