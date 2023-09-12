<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>

<%-- Using directives to include two text files which will be displayed on the 
webpage when the application is run --%>
<%-- This way is for adding static content --%>
<%@ include file="file1.txt" %>
<br/>

<%-- There's is a secondary way to include files using jsp --%>
<%-- This way is for adding dynamic content --%>
<jsp:include page="file2.txt"/>
<br/>

<%

//out is an object that is already available to be used
//this does the same function as the servlet 
out.println("Value 1: " + request.getParameter("getValue1"));
out.println("Value 2: " + request.getParameter("getValue2"));

%>

<%-- We can also import java libraries and classes --%>
<%@ page import="java.util.Date" %>
<%= new Date() %>

<%-- to import a clas we need its package and name --%>
<%@ page import="s20.JSPAndServlets.ImportedClasses.UserDefined" %>
<% out.print(new UserDefined().Demo()); %>
</body>
</html>