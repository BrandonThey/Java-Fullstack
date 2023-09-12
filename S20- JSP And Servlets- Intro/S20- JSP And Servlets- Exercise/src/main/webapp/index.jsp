<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Homepage</h1>
	
	<%-- Creating some url links to different jsp pages so the user may click a linke and be 
	forwarded/redirected --%>
	<%-- getting the context path of the url and adding the /Controller?page=login
	to create our url link  --%>
	<a href = "<%= request.getContextPath()%>/Controller?page=login">Login Here!</a>
	<a href = "<%= request.getContextPath()%>/Controller?page=signup">Sign Up</a>
	<a href = "<%= request.getContextPath()%>/Controller?page=about">Learn more about us!</a>
</body>
</html>