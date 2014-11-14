<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<html>
	<head>
		<jsp:include page="state.jsp" flush="true"/>
	</head>
  	<body>
    	<br>
    	<form action="Enter.action" method="post">
    		Account: <input type="text" name="email" value="your email" />
			<br/>
			password: <input type="text" name="password" value="password" />
			<br/>
			<input type="submit" value="login" />
		</form>
  	</body>
</html>