<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Submission</title>
</head>
<body>
	You submitted: <br/>
	<%-- Getting the values from the form.jsp file and displaying on the web page --%>
	Name: <%= request.getParameter("name") %> <br/>
	Gender: <%= request.getParameter("gender") %> <br/>
	
	<%-- Since Languages can have multiple values we need to be able to handle multiple values --%>
	Language: <% 
		String[] languages = request.getParameterValues("language");
		
		if(languages != null){
			for(String language : languages){
				out.println(language);
			}
		} else{
			out.println("N/A");
		}
	%> <br/>
	Country: <%= request.getParameter("country") %> <br/>
</body>
</html>