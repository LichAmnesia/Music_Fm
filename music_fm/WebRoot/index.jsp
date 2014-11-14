<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <title>Welcome</title>
  <meta name="description" content="描述">
  <meta name="keywords" content="关键词" >
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <style type="text/css">
        body {padding-top: 50px;}
  </style>
  </head>
  
  
  <body>
  <jsp:include page="login/state.jsp" flush="true"/>
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

  <div class="music_wrap">
		<div class="artist_info">
			<div class="artist_avatar">
				<img />
			</div>
			<div class="artist">Artist</div>
			<div class="artist_name">歌手</div>
			<div class="collection">
				<svg class="collection_select" width="100" height="100" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid meet">
					<g>
						<title>Layer 2</title>
						<g fill="#000000" transform="translate(30,50) scale(0.01500000149011612,-0.01500000149011612) ">
							<path fill="#ff0000" d="m669,1550c-112,-19 -217,-100 -267,-208c-22,-47 -27,-71 -27,-137c0,
							-143 -3,-139 352,-496l315,-316l301,303c353,356 362,368 362,503c0,107 -29,176 -105,251c-81,
							82 -184,116 -296,98c-78,-12 -129,-40 -201,-111l-63,-61l-62,61c-35,33 -81,70 -103,81c-36,18
							 -60,24 -140,36c-11,2 -41,0 -66,-4z"/>
						</g>
					</g>
				</svg>
			</div>
			
		</div>
		
		<div class="track">
			<div class="music_name">歌曲</div>
			<div class="music_album">专辑</div>
		</div>

		<div class="control">
			<div class="option">
				<div class="time">-00:00</div>
				<div class="volume" title="音量">
					<p>&#xe604;</p>
				</div>
				<!--音量-->
				<div class="volume_wrap hidden">
					<div class="volume_bar">
						<div class="volume_now"></div>
					</div>
				</div>
				<ul id="option_list">
					<li class="repeat" title="单曲循环">&#xe609;</li>
					<li class="shuffle" title="随机播放">&#xe608;</li>
					<li class="list" title="列表循环">&#xe606;</li>
				</ul>
			</div>

			<div class="progress_bar" id="bar">
				<div class="progress"></div>
				<div class="buffer"></div>
			</div>

			<div class="action_button">
				<div class="prev" title="上一首">&#xe60d;</div>
				<div class="play" title="播放" id="play">&#xe60a;</div>
				<div class="pause hidden" title="暂停">&#xe60b;</div>
				<div class="next" title="下一首">&#xe60c;</div>
			</div>
		</div>

		<audio id="audio">
			<p>您的浏览器不支持HTML5播放器呢！赶紧换一个最新的呗^_^.</p>
		</audio>
	</div>
	<div class="coder">基于 <span>&#xe600;</span> 和 <span>&#xe601;</span> 编写，经过 <span>&#xe603;</span>、<span>&#xe602;</span> 和 <span>&#xe605;</span> 测试 &nbsp;&nbsp;Code By Lich</a></div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
  	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/list.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	
  </body>
</html>
