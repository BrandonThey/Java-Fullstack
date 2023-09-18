<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%-- Creating a login page link that will redirect the user to the login page --%>
	<a href="<%= request.getContextPath()%>/SiteController?action=login">Login</a>
</body>
</html>