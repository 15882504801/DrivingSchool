<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
<title>驾校管理系统</title>
<script type="text/javascript">
	function refreshCode() {
		var img = document.getElementsByTagName("img")[0];
		img.src = "${pageContext.request.contextPath }/CheckImgServlet?time='+new Date().getTime()'"
	}
</script>
</head>
<body>
		<div class="wrap login_wrap">
			<div class="content">
				<div class="logo"></div>
				<div class="login_box">	
					
					<div class="login_form">
						<div class="login_title">
							登录
						</div>
						<form action="${pageContext.request.contextPath }/LoginServlet" method="post">
							<div class="form_text_ipt">
								<input name="tel" type="text"  placeholder="用户名">${msg}
							</div>
							<div class="ececk_warning"><span>用户名不能为空</span></div>
							<div class="form_text_ipt">
								<input name="password" type="password" placeholder="密码">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div><br>
						  <div  class="clear" ><center>
                            <span>用户角色:</span>
                            <input type="radio" name="role" checked="checked" value="student">
                            <span>学员</span>
                            <input type="radio" name="role" value="coach">
                            <span>教练</span>
                            <input type="radio" name="role" value="admin">
                            <span>管理员</span><br></center>
							 </div>	
							 <div class="form_text_ipt">
									<input name="checkCode" type="text"  placeholder="验证码">${yzm}
							</div>
							<br>
							<div class="form_reg_btn">
									<img name="codeImg" src="${pageContext.request.contextPath }/CheckImgServlet" onclick="refreshCode()" width="90" height="30">
									<a href="javascript:refreshCode()">重新获取验证码</a></div>	
							<div class="ececk_warning">
							<span>验证码错误${yzm}</span>
							</div>
							<div class="form_reg_btn"><br><font size="3"><input type="checkbox" name="remeberme" value="${checked}" >下次自动登录</font></div>
							<div class="form_text_ipt">
								<input type="submit" value="登录">
							</div><br><br/><br/>
						  <div  class="clear" ><center>
							<div class="form_reg_btn">
								<span>还没有帐号？马上注册</span>
                                <a href="studentregister.jsp">&nbsp;&nbsp; 学员注册</a>
                                <a href="coachregister.jsp">&nbsp;&nbsp;教练注册</a><br><br>
                                <a href="index.jsp">&nbsp;&nbsp;返回首页</a><br>
							</div><br>
							</center></div>
						</form>
				  </div>
			  </div>
		  </div>
	    </div>


	<script type="text/javascript" src="js/jquery.min.js" ></script>
		<script type="text/javascript" src="js/common.js" ></script>
	</body>
	</html>