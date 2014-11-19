
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
 

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link href="../music_fm/css/bootstrap.min.css" rel="stylesheet">
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
	<style type="text/css">
        body {padding-top: 50px;}
  </style>
  </head>
  
  <body>
  <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Enter</a></li>
                <li><a href="#">Register</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">个人信息 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/music_fm/listen/listen.jsp">收听列表</a></li>
                        <li><a href="#">红心歌曲</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
    This is my JSP page. <br>
    <%= customer.getUsername() %>
     <%= listen.solve(customer.getUsername()) %>
     <div class = "row">
     <div class="col-md-1"></div>
     <div class="col-md-10">
     <table class="table" border="1" width="360">
        <tr>
            <th>编号</th>
            <th>歌名</th>
            <th>演唱者</th>
        </tr>
        
        <tbody>
        <%	
        	int i = 1;
        	Iterator it = listen.ma.entrySet().iterator();
        	while (it.hasNext()){
        		i ++;
        		Map.Entry entry = (Map.Entry)it.next();
        		Object key = entry.getKey();
        		Object val = entry.getValue();
        		%>
        		<tr>
        			<td><%=i%></td>
        			<td><%=key.toString()%></td>
        			<td><%=val.toString()%></td>
        		</tr> 
        	<%} %>
        	
        </tbody>
    </table>
    </div>
    <div class="col-md-1"></div>
    </div>
    <script type="text/javascript" src="../music_fm/js/jquery.min.js"></script>
  	<script type="text/javascript" src="../music_fm/js/bootstrap.min.js"></script>
  </body>
</html>
