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
.BG {
	width: 400px;
	height: 200px;
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
<body>
<div align="center">
<h1>教练信息</h1>
<div id="page">
		<div id="top">选择教练</div>
		<div class="clear"></div>
		<div id="menu">
			<a href="index.jsp">首页</a> <a href="#">关于驾校</a> <a href="#">公告通知</a>
			<a href="#">学习流程</a> <a href="#">考试指南</a> <a href="#">考试查询</a> <a
				href="#">在线约车</a> <a href="#">学时查询</a> <a class="all" href="#">登录</a>
		</div>
		<div class="BG" style="margin-top: 50px;">
			<form action="${pageContext.request.contextPath }/ChangeCoachPasswordServlet" method="post">
				<table align="center" border="5" cellpadding="5px"
					cellspacing="10px" bordercolor="gold" width="100%">
<tr>
<td>ID</td>
<td>姓名</td>
<td>性别</td>
<td>年龄</td>
<td>电话</td>
<td>地址</td>
<td>驾照类型</td>
</tr>
<%
		@SuppressWarnings("unchecked")
        List<Coach> list =(List<Coach>)request.getSession().getAttribute("Clist");
		Student s = (Student) request.getSession().getAttribute("user");
		for (Coach c : list) {if(c.getType().equals(s.getType())){
%>
<tr>
<td><%=c.getId()%></td>
<td><%=c.getName() %></td>
<td><%=c.getSex() %></td>
<td><%=c.getAge() %></td>
<td><%=c.getTel() %></td>
<td><%=c.getAddress() %></td>
<td><%=c.getType() %></td>
<td><a href="${pageContext.request.contextPath}/SelectCoachServlet?Cid=<%=c.getId()%>">选择</a><td>
</tr>
<%}%>
<%}%>
</table>
</form>
</div>
		<div id="bottom"
			style="width: 100%; position: fixed; left: 0; bottom: 0;">
			<div id="menu">
				<a href="index.html">首页</a> <a href="#">关于驾校</a> <a href="#">公告通知</a>
				<a href="#">学习流程</a> <a href="#">考试指南</a> <a href="#">考试查询</a> <a
					href="#">在线约车</a> <a href="#">学时查询</a> <a class="all" href="#">登录</a>
			</div>
			<div id="bottom_left">&nbsp;</div>
			<div id="bottom_right">
				<span>CONTACT US</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<span>copyright 2018 &copy; momomo All Rights RESERVED</span>
			</div>
		</div>
	</div>


</div>

</body>
</html>