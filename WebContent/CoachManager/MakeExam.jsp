<%@page import="cn.cdu.edu.school.model.Examaddress"%>
<%@page import="cn.cdu.edu.school.model.Eaddress"%>
<%@page import="cn.cdu.edu.school.model.Practiceaddress"%>
<%@page import="cn.cdu.edu.school.model.Paddress"%>
<%@page import="cn.cdu.edu.school.model.Eaddress"%>
<%@page import="java.util.List"%>
<%@page import="cn.cdu.edu.school.service.impl.PlaceServiceImpl"%>
<%@page import="cn.cdu.edu.school.service.PlaceService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择考试场地</title>
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
			}
		</style>
</head>
<body><div id="page">
			<div id="top">
				学员审核界面
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
				<a class="all" href="#">登录</a>
			</div>
			<div class="BG" style="margin-top:30px;">
				<table align="center" border="5" cellpadding="5px" cellspacing="10px" bordercolor="gold" width="100%">
					<tr bgcolor="deepskyblue">
		<td>地址</td>
		<td>时间</td>
		<td>项目</td>
		<td>操作</td>
		</tr>
		<%PlaceService placeService=new PlaceServiceImpl();%>
        <%int studentid=Integer.parseInt(request.getParameter(("studentid"))); %>
		<%List<Eaddress> list=placeService.findexamplace(); %>
		<%Examaddress ea=placeService.getexam(studentid);%>
		<%if(ea!=null){ %>	
		<%request.getRequestDispatcher("/CoachManager/CoachManager.jsp").forward(request, response);	 %>
		<%}else{ %>
		<%for(Eaddress eaddress : list ){ %>
		<tr>
		<td><%=eaddress.getAddress() %></td>
		<td><%=eaddress.getTime() %></td>
		<td><%=eaddress.getType() %></td>
		<td><a href="${pageContext.request.contextPath }/SelectExamPlaceServlet?type=<%=eaddress.getType() %>&address=<%=eaddress.getAddress() %>&time=<%=eaddress.getTime() %>&studentid=<%=studentid %>">选择</a></td>
		</tr>
		<%}
		}%>
		</table>
		</div>
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
				<div id="bottom_left">
					<img alt="" src="images/logo.png">
				</div>
				<div id="bottom_right">
					<span>CONTACT US</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<span>copyright 2018 &copy;
					momomo All Rights RESERVED</span>
				</div>
			</div>
		</div>
		
</body>
</html>