<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改教练密码</title>
<style type="text/css">
			.clear {
				clear: both;
			}
			
			#top {
				text-align: center;
				font-family: 楷体;
				font-size: 80px;
			}
			
			#menu {
				background-color: #1C3F09;
				border-top: 5px solid #82B211;
				padding: 10px 0px;
				text-align: center;
			}
			
			#menu a {
				margin: 0 8px;
				color: #fff;
				text-decoration: none;
				font-weight: bold;
				font-size: 15px;
			}
			
			#menu a:hover {
				color: #999;
			}
			
			#menu .all {
				color: yellow
			}
			/*-------------------------------------------------------*/
			
			.indexLink {
				width: 60%;
				margin: 600px auto;
				float: right;
			}
			
			.indexLink ul {
				display: block;
				list-style-type: none;
			}
			
			.indexLink ul li {
				width: 200px;
				text-align: center;
				float: right;
				margin-left: 30px;
			}
			
			.indexLink ul li a,
			.indexLink ul li a:visited {
				width: 200px;
				height: 60px;
				text-align: center;
				background-color: #006a91;
				/*#90000a;*/
				color: #FFFFFF;
				font-family: 楷体;
				font-size: 18px;
				display: block;
				padding-top: 18px;
				margin-bottom: 15px;
				/*47px;*/
				text-decoration: none;
				/*font-weight:bold;*/
			}
			
			.indexLink ul li a:hover {
				background-color: #F60;
			}
			
			.indexLink ul li a.brown,
			.indexLink ul li a.brown:visited {
				background-color: #90000a;
				color: #FFFFFF;
			}
			
			.indexLink ul li a.brown:hover {
				background-color: #F60;
			}
			
			.indexLink ul li a.green,
			.indexLink ul li a.green:visited {
				background-color: #7a8523;
				color: #FFFFFF;
			}
			
			.indexLink ul li a.green:hover {
				background-color: #F60;
			}
			
			.indexLink ul li a.orange,
			.indexLink ul li a.orange:visited {
				background-color: #d5641c;
				color: #FFFFFF;
			}
			
			.indexLink ul li a.orange:hover {
				background-color: #F60;
			}
			/*-------------------------------------------------------*/
			
			#bottom {
				background-color: #EFEEDC;
				height: 60px;
				padding: 10px 0px;
			}
			
			#bottom_left {
				width: 400px;
				float: left;
				margin-left: 200px;
			}
			
			#bottom_right {
				width: 500px;
				float: left;
				line-height: 28px;
				/*行高*/
			}
		</style>
</head>
<body>
<div id="top">
				改变教练密码
			</div>
			<div class="clear"></div>
			<div id="menu">
				<a href="index.html">首页</a>
				<a href="#">关于驾校</a>
				<a href="#">公告通知</a>
				<a href="#">学习流程</a>
				<a href="#">考试指南</a>
				<a href="#">考试查询</a>
				<a href="#">在线约车</a>
				<a href="#">学时查询</a>
				<a class="all" href="../Login/Login.jsp">登录</a>
			</div>
<form action="${pageContext.request.contextPath }/ChangeCoachPasswordServlet" method="post">
		<table align="center" border="5" cellpadding="5px" cellspacing="10px" bordercolor="gold" width="50%">
			<tr>
				<td>旧密码：</td>
				<td><input name="oldpassword" type="password">${msg}</td>
			</tr>
			<tr>
				<td>新密码:</td>
				<td><input name="newpassword" type="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="确定">
					<input type="reset" value="取消"></td>
			</tr>
		</table>
	</form>
	<div id="bottom" style="width:100%; position:fixed; left:0; bottom:0;">
				<div id="menu">
					<a href="index.jsp">首页</a>
					<a href="#">关于驾校</a>
					<a href="#">公告通知</a>
					<a href="#">学习流程</a>
					<a href="#">考试指南</a>
					<a href="#">考试查询</a>
					<a href="#">在线约车</a>
					<a href="#">学时查询</a>
					<a class="all" href="#">登录</a>
				</div>
				</div>
</body>
</html>