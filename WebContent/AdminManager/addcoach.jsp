<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加教练</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
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
			
			.table tr td {
				padding: 30px 50px;
			}
			
			.BG {
				width: 800px;
				height: 1000px;
				margin: auto;
				text-align: center;
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
			}</style>
</head>
<body>
<div id="top">
				添加教练
			</div>
			<div class="clear"></div>
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
			
<form action="${pageContext.request.contextPath}/AddCoachServlet?action=addCoach" method="post">
<table align="center" border="5" cellpadding="5px" cellspacing="10px" bordercolor="gold" width="50%">
  <tr>
    <td bgcolor="deepskyblue" width="293" align="center">姓名</td>
    <td width="299" align="center"><input name="name" type="text" width="299"></td>
  </tr>
  <tr>
    <td bgcolor="deepskyblue" align="center">性别</td>
    <td align="center"><input name="sex" type="text" width="29999"></td>
  </tr>
  <tr>
    <td bgcolor="deepskyblue" align="center">年龄</td>
    <td align="center"><input name="age" type="text" width="299"></td>
  </tr>
  <tr>
    <td bgcolor="deepskyblue" align="center">电话</td>
    <td align="center"><input name="tel" type="text" width="299"></td>
  </tr>
  <tr>
    <td bgcolor="deepskyblue" height="50" align="center">地址</td>
    <td align="center"><input name="address" type="text" width="299"></td>
  </tr>
  <tr>
    <td bgcolor="deepskyblue" height="50"align="center">密码</td>
    <td align="center"><input name="password" type="text" width="299"></td>
  </tr>
  <tr>
    <td  bgcolor="deepskyblue" height="50" align="center">驾照类型</td>
    <td align="center"><input name="type" type="text" width="299"></td>
  </tr>
  <tr>
  <td   colspan="2" align="center"><input type="submit" value="确认保存" ></td>
   </tr>
</table>
</form>

<div id="bottom" style="width:100%; position:fixed; left:0; bottom:0;">
				<div id="menu">
					<a href="index.html">首页</a>
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