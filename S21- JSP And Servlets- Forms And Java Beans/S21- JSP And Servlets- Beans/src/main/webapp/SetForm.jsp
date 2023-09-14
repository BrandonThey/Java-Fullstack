<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Form</title>
</head>
<body>
	<%-- Creating a new bean that will hold properties from the user class --%>
	<jsp:useBean id="userForm" class="S21.JSPAndServlets.Beans.User" scope="session"></jsp:useBean>

	<%-- Creating a form for the user to be able to enter their first and last name --%>
	<form action="GetForm.jsp" method="post">
		<%--the name of the input should match the name of the properties you want to set
		this allows a 1 to 1 relationship between the two --%>
		First Name: <input type="text" name="firstName" value="<jsp:getProperty property="firstName" name="userForm"/>">
		<br/>
		Last Name: <input type="text" name="lastName" value="<jsp:getProperty property="lastName" name="userForm"/>">
		<br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>