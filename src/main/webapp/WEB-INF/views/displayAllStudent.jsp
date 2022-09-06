<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>display</title>
</head>
<body>
	<center>
		<table border="1px">
			<h3>All Student Records...</h3>
			<tr>
				<th>Id</th>
				<th>first-Name</th>
				<th>last-Name</th>
				<th>Address</th>
				<th>mobileNo</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			
			<c:forEach items="${allStudent}" var="std">
				<tr>
					<td>${std.Id}</td>
					<td>${std.firstName}</td>
					<td>${std.lastName}</td>
					<td>${std.Address}</td>
					<td>${std.mobileNo}</td>
					<td>
					
					<a href="<spring:url value="/student/findStudent/${std.Id}"/>">Update</a></td>
					<td>
					<a href="<spring:url value="/student/deleteStudent/${std.Id}"/>">Delete</a></td>
				</tr>
				
			</c:forEach>
		</table>
	</center>

</body>
</html>