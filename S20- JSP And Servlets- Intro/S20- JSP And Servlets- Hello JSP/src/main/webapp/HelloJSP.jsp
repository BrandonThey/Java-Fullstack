<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- JSP is similar to HTML but it adds dynamic actions to the web page 
this allows JSP to dynamically generate web pages while HTML stays static --%>
<%--There are different JSP Scripting elements, one of which is this comment, others are
<%= Expression %> - a valid java expression, which is evaluated and returned as a string
<% Scriptlets %> - a block of java code that may or may not have an output
<%! Declaration %> -creation of variables and methods
<%@ Directive %> - Elements of JSP Source code that help translates the page into a servlet
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%--Example declaration and expression JSP elements --%>
	<%! public int x = 22; %>
	<%= x %>
	<br>
	
	<%= new java.util.Date() %>
	<br>
	
	<%= 25>5 %>
	<br>
	
	<%--Example Scriptlet block --%>
	<%
		//adding a comment is the same as in a java file when in a scriptlet
		int x = 25;
		
		if(x>25){
			out.println("X is greater than 25");
		}else{
			out.println("X is not greater than 25");
		}
	%>
	<br>
	
	<!-- We can also use an HTML Comment like this one but this is less reliable than 
	a JSP Comment, because it will only comment out printable characters and not
	certain expressions -->>
	
	<%
		for(int i = 0; i < 10; i++){
			out.print("<br/>");
			out.print(i);
		}
	%>
	<br>
	
	<%-- Declaration of a method --%>
	<%!
		String message(){
			return "I LOVE JSP";
		}
	%>
	<%= message() %>
</body>
</html>
