<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Creating a form that will send data to the submit.jsp file --%>
<form action="submit.jsp" method="get">
	<%-- The form's input box asking for a name, which is of type text, and naming the 
	form input "name" --%>
	<%= out.println("Full Name: ") %> <input type="text" name="name"/><br/>
	<%-- The form's radio menu waiting for a selection, which is of type radio, and naming the 
	form input "gender", and setting any returned values --%>
	<%= out.println("Gender: ") %> 
		<input type="radio" name="gender" value="Male"> <%= out.println("Male") %>
		<input type="radio" name="gender" value="Female"> <%= out.println("Female") %><br/>
	<%= out.println("Languages Known: ") %> 
		<input type="Checkbox" name="language" value="english"> <%= out.println("English") %>
		<input type="Checkbox" name="language" value="spanish"> <%= out.println("Spanish") %>
		<input type="Checkbox" name="language" value="french"> <%= out.println("French") %>
</form>
</body>
</html>