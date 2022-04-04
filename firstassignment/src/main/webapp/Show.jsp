<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="s" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="firstassignment.beans.RegInfoBean" %>
  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Show Details </title>
</head>
<body>
  <%
ArrayList<RegInfoBean> li =(ArrayList<RegInfoBean>)session.getAttribute("listitem");
    
%>
<s:out value="${sessionScope.li}" />


</body>
</html>