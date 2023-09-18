<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member Area</title>
</head>
<body>
	<%
		String username = null, sessionID = null;
		Cookie[] cookies = request.getCookies();
		
		//checking through the array of cookies to find a username and/or session id
		//if one is available
		if(cookies != null){
			for(Cookie cookie: cookies){
				if(cookie.getName().equals("username")){
					username = cookie.getValue();	
				}
				if(cookie.getName().equals("JSESSIONID")){
					sessionID = cookie.getValue();	
				}
			}
		}
		
		//if there was no username or sessionID found then redirect back to the login page
		if(sessionID == null || username == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	Welcome <%= username %> to the member only area!! <br/>
	The session id is: <%= sessionID %>
	
	<%-- Creating a form that will destroy the user cookies on logout--%>
	<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
		<input type="hidden" name="action" value="destroy">
	</form>
</body>
</html>