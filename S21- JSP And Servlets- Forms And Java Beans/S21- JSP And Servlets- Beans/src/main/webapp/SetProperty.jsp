<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Properties</title>
</head>
<body>
	<jsp:useBean id="user" class="S21.JSPAndServlets.Beans.User" scope="session"></jsp:useBean>

	<%-- writing data to our class using setProperty, by entering the name of the bean 
	and the property we want to target--%>
	<jsp:setProperty property="firstName" name="user" value="Brandon"/>
	<jsp:setProperty property="lastName" name="user" value="They"/>
	Values have been set
</body>
</html>