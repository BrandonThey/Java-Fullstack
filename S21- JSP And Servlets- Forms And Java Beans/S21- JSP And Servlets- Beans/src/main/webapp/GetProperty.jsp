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
	-any number of getters and setters for those properties --%>
	
	<%-- Creating a bean with the id of "user" and using
	our user class, as well as setting its scope --%>
	<%-- The scope affects the accessibility and visibility of the bean:
	Request scope is the smallest covering and properties and values are refreshed 
		per request on the web page
	Page scope means that the properties and values only persist per page and are 
		defaulted every time the page is refreshed or a new page is opened
	Session scope means the bean's properties and values are per session, meaning 
		that when a new window or browser is opened the bean will default
	Application scope is the widest covering and the property's values are maintained 
		throughout sessions--%>
	<jsp:useBean id="user" class="S21.JSPAndServlets.Beans.User" scope="session"></jsp:useBean>

	<%-- reading the data from our class using getProperty, by entering the name of the bean 
	and the property we want to target--%>
	First Name: <jsp:getProperty property="firstName" name="user"/>
	Last Name: <jsp:getProperty property="lastName" name="user"/>
</body>
</html>