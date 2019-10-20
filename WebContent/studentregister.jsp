<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学员注册</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
</head>
	<body>
		<div class="wrap login_wrap">
			<div class="content">
				
				<div class="logo"></div>
				
				<div class="login_box">	
					
					<div class="login_form">
						<div class="login_title">
							学员注册
						</div>
						<form action="${pageContext.request.contextPath}/AddStudentServlet"  method="post">
                         <div class="form_text_ipt">
								<input name="name" type="text" placeholder="姓名">
							</div>
							<div class="ececk_warning"><span>姓名不能为空</span></div>
                           <br>
                           <div  class="clear" ><center>
                            <span>性别:</span>
                            <input type="radio" name="sex" checked="checked" value="1">
                            <span>男	</span>
                            <input type="radio" name="sex" value="2">
                            <span>女</span></center>
                            <div class="form_text_ipt">
								<input name="age" type="text" placeholder="年龄">
							</div>
							<div class="ececk_warning"><span>年龄不能为空</span></div>               
							<div class="form_text_ipt">
								<input name="tel" type="text" placeholder="电话号码">
							</div>
							<div class="ececk_warning"><span>电话号码不能为空</span></div>
							<div class="form_text_ipt">
								<input name="address" type="text" placeholder="地址">
							</div>
							<div class="ececk_warning"><span>地址不能为空</span></div>
							<div class="form_text_ipt">
								<input name="password" type="password" placeholder="密码">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							<div class="form_text_ipt">
								<input name="repassword" type="password" placeholder="重复密码">
							</div>
							<div class="ececk_warning"><span>密码不能为空</span></div>
							<div class="form_text_ipt">
								<input name="type" type="text" placeholder="报考驾照类型">
							</div>
							<div class="ececk_warning"><span>报考驾照类型不能为空</span></div>
							<div class="form_text_ipt"><input type="text" name="phoneCode" ><a href="${pageContext.request.contextPath }/PhoneServlet">获取手机验证码</a>${yz }
							</div>
							<div class="ececk_warning"><span>验证码不能为空</span></div>
							<div class="form_text_ipt">
								<input type="submit" value="注册">
							</div><br>
							<div class="form_reg_btn">
								<span>已有帐号？</span><a href="login.jsp">马上登录</a><br><br>
							</div>
						</form>
                  </div>
                        
			  </div>
		  </div>
     	</div>
	    <script type="text/javascript" src="js/jquery.min.js" ></script>
		<script type="text/javascript" src="js/common.js" ></script>
	</body>
</html>
