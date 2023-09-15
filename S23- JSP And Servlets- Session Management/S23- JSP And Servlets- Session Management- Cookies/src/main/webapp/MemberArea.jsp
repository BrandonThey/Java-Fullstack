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
		String username = "", sessionID = "";
		Cookie[] cookies = request.getCookies();
		
		//checking through the array of cookies to find a username or session id
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
	%>
	Welcome <%= username %>> to the member only area!!
	The session id is: <%= sessionID %>>
</body>
</html>