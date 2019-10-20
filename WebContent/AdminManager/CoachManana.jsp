<%@page import="cn.cdu.edu.school.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="cn.cdu.edu.school.model.Coach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/reset.css" />
	<link rel="stylesheet" href="css/common.css" />
	<link rel="stylesheet" href="css/comm.css" />
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
<body><div id="top">
				教练信息
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
			</div>
				  
					<div align="center">
					<table align="center" border="5" cellpadding="5px" cellspacing="10px" bordercolor="gold" width="50%">
  <tr>
					<td bgcolor="deepskyblue" align="center">ID</td>
					<td bgcolor="deepskyblue" width="293" align="center">姓名</td>
					<td bgcolor="deepskyblue" align="center">性别</td>
					<td bgcolor="deepskyblue" align="center">年龄</td>
					<td bgcolor="deepskyblue" align="center">电话</td>
					<td bgcolor="deepskyblue" height="50" align="center">地址</td>
					<td bgcolor="deepskyblue" height="50"align="center">驾照类型</td>
					<td bgcolor="deepskyblue" height="50"align="center">操作</td>
					</tr>
					<%
							@SuppressWarnings("unchecked")
					        List<Coach> list =(List<Coach>)request.getSession().getAttribute("Clist");
							for (Coach c : list){
					%>
					<tr>
					<td bgcolor="deepskyblue" width="293" align="center"><%=c.getId()%></td>
					<td bgcolor="deepskyblue" align="center"><%=c.getName() %></td>
					<td bgcolor="deepskyblue" align="center"><%=c.getSex() %></td>
					<td bgcolor="deepskyblue" align="center"><%=c.getAge() %></td>
					<td bgcolor="deepskyblue" align="center"><%=c.getTel() %></td>
					<td bgcolor="deepskyblue" height="50" align="center"><%=c.getAddress() %></td>
					<td bgcolor="deepskyblue" height="50" align="center"><%=c.getType() %></td>
					<td bgcolor="deepskyblue" height="50" align="center"><a href="${pageContext.request.contextPath }/DelCoachServlet?id=<%=c.getId()%>">删除</a></td>
					</tr>
					<%}%>
					<tr><td colspan="" bgcolor="deepskyblue" height="50" align="center"><a href="/DrivingSchool/AdminManager/addcoach.jsp">添加</a></td></tr>
					</table>
					</div>
					

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
				</div>


</div>

</body>
</html>