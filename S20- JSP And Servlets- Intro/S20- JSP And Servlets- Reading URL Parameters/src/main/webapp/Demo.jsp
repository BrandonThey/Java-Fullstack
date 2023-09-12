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
	out.println("It's from the original page");
%>

<%-- Creating a forward to the forward.jsp file which will run the application there 
without changing the url--%>
<%
	//request.getRequestDispatcher("Forward.jsp").forward(request,response);
%>

<%-- Secondary way to forward --%>
<%-- <jsp:forward page="Forward.jsp"></jsp:forward> --%>

<%-- Creating a redirect to the Redirect.jsp file which will run the application there 
AND changing the url, But you cannot redirect/forward after one another--%>
<%
	response.sendRedirect("Redirect.jsp");
%>

</body>
</html>