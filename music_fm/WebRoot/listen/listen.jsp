
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
 

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>收听列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<jsp:useBean id="mdlisten" class="mydb.Listen" scope="session"/>
	<jsp:useBean id="customer" class="mydb.Customer" scope="session"/>
	<jsp:useBean id="listen" class="listen.listen" scope="session"/>
  </head>
  
  <body>
    This is my JSP page. <br>
     <table border="1" width="360">
 <%
                                String[] books = listen.books;
                                 for (String book : books)
                                 {
                                 %>
                                 <tr>
                                    <td>书名：</td>
                                    <td><%=book%></td>
                                 </tr>
                                 <%}%>
                                 </table>
     <table border="1" width="360">
        
        <tr>
            <th>书名：</th>
            <th>书名：</th>
            <th>书名：</th>
        </tr>
        
        <tbody>
       
        <%
                                String[] books1 = listen.books;
                                 for (String book : books1)
                                 {
                                 %>
                                 <tr>
                                 	<td>书名：</td>
                                    <td>书名：</td>
                                    <td><%=book%></td>
                                 </tr>
                                 <%}%>
        </tbody>
    </table>
    
    
  </body>
</html>
