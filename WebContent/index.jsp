<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
	<meta charset="UTF-8">
	<title>主页</title>
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
		/*-------------------------------------------------------*/
		
		#content {
			width: 900px;
			margin: 8px auto 15px;
			/*auto div居中*/
		}
		
		#wrap {
			width: 510px;
			height: 286px;
			margin: 0 auto;
			position: relative;
			background: pink;
			overflow: hidden;
		}
		
		#inner {
			width: 1000%;
			height: 100%;
			position: absolute;
			left: 0;
			top: 0;
		}
		
		#inner img {
			width: 10%;
			height: 100%;
			float: left;
		}
		
		.paganation {
			width: 100%;
			position: absolute;
			bottom: 10px;
			text-align: center;
		}
		
		.paganation span {
			padding: 5px 8px;
			background: #F2F2F2;
			color: red;
			border-radius: 50%;
			cursor: pointer
		}
		
		.paganation .selected {
			background: red;
			color: white;
		}
		
		.arrow {
			position: absolute;
			top: 0;
			width: 30px;
			height: 286px;
			line-height: 286px;
			text-align: center;
			color: red;
			cursor: pointer;
		}
		
		#right {
			right: 0;
		}
		
		.arrow:hover {
			background: rgba(0, 0, 0, 0.5);
		}
		/*-------------------------------------------------------*/
		
		.aa {
			float: left;
			width: 33.3%;
			height: 30px;
			padding: 0;
			margin: 0;
			list-style: none;
			height: 250px;
		}
		
		#content_bottom {
			font-size: 15px;
		}
		
		h1 {
			color: blue;
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
	<div id="page">
		<div style="width: 300px; height: 300px; left: 0; top: 300px; position: absolute;">
			<img src="image/a.png" style="width: 80%; height: 100%;">
		</div>
		<div id="top">
			驾校管理系统
		</div>
		<div class="clear"></div>
		<div id="menu">
			<a href="index..jsp">首页</a>
			<a href="#">关于驾校</a>
			<a href="#">公告通知</a>
			<a href="#">学习流程</a>
			<a href="#">考试指南</a>
			<a href="#">考试查询</a>
			<a href="#">在线约车</a>
			<a href="#">学时查询</a>
			<a class="all" href="login.jsp">登录</a>
		</div>
		<div id="content">
			<div id="content_top">
				<div id="wrap">
					<div id="inner" class="clear">
						<img style="background:red;" src="image/1.png" alt="">
						<img style="background:orange;" src="image/2.png" alt="">
						<img style="background:green;" src="image/3.png" alt="">
						<img style="background:cyan;" src="image/4.png" alt="">
						<img style="background:yellow;" src="image/5.png" alt="">
						<img style="background:purple;" src="image/6.png" alt="">
						<img style="background:pink;" src="image/7.png" alt="">
						<img style="background:blue;" src="image/8.png" alt="">
						<img style="background:red;" src="image/1.png" alt="">
					</div>
					<div class="paganation" id="paganation">
						<span class="selected">1</span>
						<span>2</span>
						<span>3</span>
						<span>4</span>
						<span>5</span>
						<span>6</span>
						<span>7</span>
						<span>8</span>
					</div>
					<div id="left" class="arrow">
					</div>
					<div id="right" class="arrow">></div>
				</div>
			</div>
			<div id="content_bottom">
				<li class="aa" style="background-color: thistle;">
					<h2>驾校资讯<a href="#" style="font-size: 10px;">更多</a></h2>
					<ul>
						<li>
							<a href="#">新学员必读</a>
						</li>
						<li>
							<a href="#">学车福利大放送！最低只要2980！</a>
						</li>
						<li>
							<a href="#">学车告别严寒酷暑，来驾校享受空调房</a>
						</li>
						<li>
							<a href="#">腾飞再谱华章，打造全国最美驾校！！</a>
						</li>
						<li>
							<a href="#">驾校报名即送3000元大礼</a>
						</li>
						<li>
							<a href="#">关于考试费的通知 </a>
						</li>
						<li>
							<a href="#">我校顺利通过省一类驾校资质验收 </a>
						</li>

					</ul>
				</li>
				<li class="aa" style="background-color:plum;">
					<h2>助考中心<a href="#" style="font-size: 10px;">更多</a></h2>
					<ul>
						<li>
							<a href="#">倒车入库考试破解技巧</a>
						</li>
						<li>
							<a href="#"> 最新直角转弯考试破解 </a>
						</li>
						<li>
							<a href="#">自动档车技巧</a>
						</li>
						<li>
							<a href="#">离合器的操作一快、二慢、三联动</a>
						</li>
						<li>
							<a href="#">机动车驾驶员申领、办理、增驾、换证指南 </a>
						</li>
						<li>
							<a href="#">侧方移位路线图及完全功略 </a>
						</li>
						<li>
							<a href="#"> 怎样破解最新路考九道关? </a>
						</li>
					</ul>
				</li>
				<li class="aa" style="background-color:peachpuff;">
					<h2>常见问题<a href="#" style="font-size: 10px;">更多</a></h2>
					<ul>
						<li>
							<a href="#">考驾照需要体检吗？</a>
						</li>
						<li>
							<a href="#"> 近视眼可以考驾照吗 </a>
						</li>
						<li>
							<a href="#">如何选择一个适合自己的驾校？</a>
						</li>
						<li>
							<a href="#">为什么我闯红灯扣6分，他闯红灯却扣2分？</a>
						</li>
						<li>
							<a href="#">开车过程中遇到碰瓷了该怎么办？ </a>
						</li>
						<li>
							<a href="#">驾照被扣12分该怎么办？ </a>
						</li>
						<li>
							<a href="#"> 节日爱车被爆竹炸伤 如何理赔？ </a>
						</li>
					</ul>
				</li>
			</div>

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
				<a class="all" href="login.jsp">登录</a>
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
<script type="text/javascript">
	var wrap = document.getElementById("wrap");
	var inner = document.getElementById("inner");
	var spanList = document.getElementById("paganation").getElementsByTagName("span");
	var left = document.getElementById("left");
	var right = document.getElementById("right");

	var clickFlag = true;
	var time
	var index = 0;
	var Distance = wrap.offsetWidth;

	function AutoGo() {
		var start = inner.offsetLeft;
		var end = index * Distance * (-1);
		var change = end - start;
		var timer;
		var t = 0;
		var maxT = 30;
		clear();
		if(index == spanList.length) {
			spanList[0].className = "selected";
		} else {
			spanList[index].className = "selected";
		}
		clearInterval(timer);
		timer = setInterval(function() {
			t++;
			if(t >= maxT) {
				clearInterval(timer);
				clickFlag = true;
			}
			inner.style.left = change / maxT * t + start + "px";
			if(index == spanList.length && t >= maxT) {
				inner.style.left = 0;
				index = 0;
			}
		}, 17);
	}

	function forward() {
		index++;
		if(index > spanList.length) {
			index = 0;
		}
		AutoGo();
	}

	function backward() {
		index--;
		if(index < 0) {
			index = spanList.length - 1;
			inner.style.left = (index + 1) * Distance * (-1) + "px";
		}
		AutoGo();
	}
	time = setInterval(forward, 3000);
	wrap.onmouseover = function() {
		clearInterval(time);
	}
	wrap.onmouseout = function() {
		time = setInterval(forward, 3000);
	}
	for(var i = 0; i < spanList.length; i++) {
		spanList[i].onclick = function() {
			index = this.innerText - 1;
			AutoGo();
		}
	}
	left.onclick = function() {
		if(clickFlag) {
			backward();
		}
		clickFlag = false;
	}
	right.onclick = function() {
		if(clickFlag) {
			forward();
		}
		clickFlag = false;
	}

	function clear() {
		for(var i = 0; i < spanList.length; i++) {
			spanList[i].className = "";
		}
	}
</script>

</html>