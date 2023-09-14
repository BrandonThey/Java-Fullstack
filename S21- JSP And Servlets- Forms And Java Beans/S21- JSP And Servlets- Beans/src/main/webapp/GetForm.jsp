<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Form</title>
</head>
<body>
	<jsp:useBean id="userForm" class="S21.JSPAndServlets.Beans.User" scope="session"></jsp:useBean>
	<%-- setting the properties based on the information from the form
	we do this using the "*" in the property="" and this works since we have a 1 to 1
	relationship among the submitted data and the bean --%>
	<jsp:setProperty property="*" name="userForm"/>
	First Name: <jsp:getProperty property="firstName" name="userForm"/><br/>
	Last Name: <jsp:getProperty property="lastName" name="userForm"/>
</body>
</html>