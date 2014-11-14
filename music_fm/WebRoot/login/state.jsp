<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="customer" class="mydb.Customer" scope="session"/>
<%
	String ss = "out.jsp";
	if ( customer.getUsername()!=null ) {
		ss = "in.jsp";
	}
%>
<html>
  	<body>
    	<jsp:include page= "<%=ss %>" flush="true"/>
   	</body>
   	<hr/>
</html>