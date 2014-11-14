<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<html>
	<head>
		<jsp:include page="state.jsp" flush="true"/>
	</head>
  	<body>
    	
    	<br>
    	<form action="Register.action" method="post">
    		Email: <input type="text" name="email" value="your email" />
			<br/>
			password: <input type="text" name="password" value="password" />
			<br/>
			NickName: <input type="text" name="name" value="nick name~~" />
			<br/>
			<input type="submit" value="Register" />
		</form>
  	</body>
</html>