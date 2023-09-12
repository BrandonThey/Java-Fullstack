<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
<%

//out is an object that is already available to be used
//this does the same function as the servlet 
out.println("Value 1: " + request.getParameter("getValue1"));
out.println("Value 2: " + request.getParameter("getValue2"));

%>
</body>
</html>