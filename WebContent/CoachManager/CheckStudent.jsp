<%@page import="cn.cdu.edu.school.dao.impl.StudentDaoImpl"%>
<%@page import="cn.cdu.edu.school.dao.StudentDao"%>
<%@page import="cn.cdu.edu.school.model.Coach"%>
<%@page import="cn.cdu.edu.school.model.Sel"%>
<%@page import="cn.cdu.edu.school.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="cn.cdu.edu.school.service.impl.StudentServiceImpl"%>
<%@page import="cn.cdu.edu.school.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



	<link rel="stylesheet" href="css/comm.css" />
<title>审核学员</title>
</head>
<body>
<div id="top">
				教练审核管理
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

<table align="center" border="5" cellpadding="5px" cellspacing="10px" bordercolor="gold" width="100%">
		<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>电话</td>
		<td>操作</td>
		</tr>
		<%StudentDao studentDao=new StudentDaoImpl();%>
		<%Sel sel=new Sel(); %>
		
		<%Coach coach=(Coach)session.getAttribute("user") ;%>
		<%System.out.println(coach); %>
		<%int id=coach.getId(); %>
		<%List<Student> list=(List<Student>)request.getAttribute("list"); %>
			<%System.out.println(list); %>
		<%for(Student student : list ){ %>
		<%sel=studentDao.findbyid(student.getId());%>
		<%System.out.println(sel); %>
		<%if(sel!=null){ %>
		<%if(sel.getCoachid()==id){ %>
		<tr>
		<%System.out.println("a"); %>
		<td><%=student.getId() %></td>
		<td><%=student.getName() %></td>
		<td><%=student.getSex()%></td>
		<td><%=student.getAge() %></td>
		<td><%=student.getTel() %></td>
		
		<%if(sel.getSeldate()!=null){ %>
	
		<td>已选择</td>
		<%}else{ %>
		<td><a href="${pageContext.request.contextPath }/SelectStudentServlet?studentid=<%=student.getId()%>">选择</a><br>
		<a href="${pageContext.request.contextPath }/DelSelectServlet?studentid=<%=student.getId()%>">不选择</a></td>
		<%} %>
		</tr>
		<%}%>
		<%}
		}%>
</table>
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