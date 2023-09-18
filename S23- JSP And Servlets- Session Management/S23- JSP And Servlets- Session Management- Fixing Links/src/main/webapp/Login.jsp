<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%-- creating a form that when submitted posts the user data to the SiteController servlet --%>
	<form action="<%= request.getContextPath() %>/SiteController" method="post">
		Username: <input type="text" name="username"><br/>
		Password: <input type="password" name="password"><br/>
		<%-- Hidden request parameter that will trigger the loginSubmit case --%>
		<input type="hidden" name="action" value="loginSubmit">
		<input type="submit" value="submit">
	</form>
</body>
</html>