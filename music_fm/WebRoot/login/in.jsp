<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<jsp:useBean id="customer" class="mydb.Customer" scope="session"/>
	</head>
  	<body>
    	<a><%=customer.getUsername() %></a>
    	|
    	<a href="Logout.action">Logout</a>
  	</body>
</html>