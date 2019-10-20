<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
 <script type="text/javascript">
	function refreshCode() {
		var img = document.getElementsByTagName("img")[0];
		img.src = "${pageContext.request.contextPath }/CheckImgServlet?time='+new Date().getTime()'"
	}
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/LoginServlet" method="post">
用户名：<input type="text" name="tel" value="${tel }">${msg}<br />
密码： <input type="password" name="password" value="${password }"><br />
<input  type="checkbox" name="role" value="student">学员
<input  type="checkbox" name="role" value="coach">教练
<input  type="checkbox" name="role" value="admin">管理员  <br />
验证码：<input type="text" name="checkCode">${yzm }<br>
<img name="codeImg" src="${pageContext.request.contextPath }/CheckImgServlet" onclick="refreshCode()" width="60" height="20">
<a href="javascript:refreshCode()">重新获取验证码</a><br>
记住<input type="checkbox" name="remeberme" value="${checked}">
<input type="submit" value="登录"> <input type="reset" value="重置">

</form>
</body>
</html>