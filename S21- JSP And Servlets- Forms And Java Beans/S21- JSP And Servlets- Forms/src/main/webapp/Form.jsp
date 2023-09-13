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
<form action="Submit.jsp" method="post">
	<%-- The form's input box asking for a name, which is of type text, and naming the 
	form input "name" --%>
	Full Name: <input type="text" name="name"/><br/>
	
	<%-- The form's radio buttons waiting for a selection, which is of type radio, and naming the 
	form input "gender", and setting any returned values --%>
	Gender:  
		<input type="radio" name="gender" value="Male"> Male
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