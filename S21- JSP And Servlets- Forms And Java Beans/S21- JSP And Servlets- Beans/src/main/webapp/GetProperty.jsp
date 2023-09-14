<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Property</title>
</head>
<body>
	<%-- A Java Bean is a class written to certain API Specifications:
	-Provides a default no-argument constructor
	-Should be serializable which can implement the Serializable interface
	-may have a number of properties that are read or written from/to
	-getters and setters for those properties --%>
	
	<%-- Creating a bean with the id of "user" and using
	our user class, as well as setting its scope --%>
	<jsp:useBean id="user" class="S21.JSPAndServlets.Beans.User" scope="session"></jsp:useBean>

	<%-- reading the data from our class using getProperty, by entering the name of the bean 
	and the property we want to target--%>
	First Name: <jsp:getProperty property="firstName" name="user"/>
	Last Name: <jsp:getProperty property="lastName" name="user"/>
</body>
</html>