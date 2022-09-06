<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Update form</title>
</head>
<body>
	<center>
		<spring:url value="/student/updateStudent" var="update" />
		<table border="1px">
			<form:form action="${update}" method="post" modelAttribute="studentUpdate">
				
				<!-- Mention id  -->
				<tr>
					<th>Id</th>
					<td><form:input path="Id" /></td>
				</tr>
				
				<!-- Mention FirstName  -->
				<tr>
					<th>FirstName</th>
					<td><form:input path="FirstName" /></td>
				</tr>
				
				<!-- Mention LastName  -->
				<tr>
					<th>LastName</th>
					<td><form:input path="LastName" /></td>
				</tr>
				
				<!-- Mention Address  -->
				<tr>
					<th>Address</th>
					<td><form:input path="Address" /></td>
				</tr>
				
				<!-- Mention Mobile Number  -->
				<tr>
					<th>Mobile Number</th>
					<td><form:input path="MobileNo" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Update&Save" /></td>
				</tr>
				
				
			</form:form>
		</table>
	</center>
</body>
</html>