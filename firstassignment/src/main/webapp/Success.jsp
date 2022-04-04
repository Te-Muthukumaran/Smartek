<%@page import="firstassignment.beans.RegInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
 		List<RegInfoBean> list =(List<RegInfoBean>) request.getAttribute("list");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form   method="get" action="Show.jsp">  
Registered Successfully

<input type="submit" value="Show"/>
</form>


</body>
</html>