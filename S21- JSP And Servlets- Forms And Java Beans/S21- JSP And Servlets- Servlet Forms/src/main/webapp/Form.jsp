<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- Creating a form that will send data to the controller servlet rather than
the submit jsp file --%>
<%-- the difference between method="get" and method="post" is that the user
does not see the url parameters in the post --%>
<form action="<%= request.getContextPath() %>/Controller" method="post">
	<%-- The form's input box asking for a name, which is of type text, and naming the 
	form input "name" --%>
	<%-- adding the required keywords forces the user to enter a name --%>
	Full Name: <input type="text" name="name" required/><br/>
	
	<%-- The form's radio buttons waiting for a selection, which is of type radio, and naming the 
	form input "gender", and setting any returned values --%>
	Gender:  
		<%-- the checked option means that the male gender is checked by default
		and the user cannot deselect an option --%>
		<input type="radio" name="gender" value="Male" checked="checked"> Male
		<input type="radio" name="gender" value="Female"> Female <br/>
	
	<%-- check box menu with multiple options --%>
	Languages Known: 
		<input type="Checkbox" name="language" value="English"> English
		<input type="Checkbox" name="language" value="Spanish"> Spanish
		<input type="Checkbox" name="language" value="French"> French <br/>
	
	<%-- country drop down menu --%>
	Country: 
		<select name="country">
			<option value="Usa">USA</option>
			<option value="Mexico">Mexico</option>
			<option value="Canada">Canada</option>
			<option value="France">France</option>
			<option value="India">India</option>
		</select><br/>
	
	<%-- submit button --%>
	<input type="submit" value="submit">
</form>
</body>
</html>