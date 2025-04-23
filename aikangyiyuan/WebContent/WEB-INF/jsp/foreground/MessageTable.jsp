<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	 /*
    @Author:Jaylan Zhou
    @Date:
    @projectName:
    @TEL:13166803607
    @QQ:764540631
    */

	/*
	    全路径,形式如下:
	    request.getScheme():获取http协议
	    request.getServerName():获取本地服务器名
	    request.getServerPort():获取服务器端口号
	    path:访问路径
	*/
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<base href="<%=basepath%>">
<meta http-equiv="Content-Type" content="text/html;" charset=UTF-8">
<title>爱康医院专家预约系统</title>
<meta content="" name=keywords />
<meta content="" name=description />
<link href="css/css/foreground/common.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/a.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/searchform.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/searchform-2.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/commentlist.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/style-2.css" rel="stylesheet" type="text/css" />
<link href="css/css/foreground/f.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/js/foreground/channelmenu_1030.js"></script>
<script type="text/javascript" src="js/js/foreground/base.js"></script>
<script type="text/javascript" src="js/js/foreground/common.js"></script>
<script type="text/javascript" src="js/js/foreground/form.js"></script>
<script type="text/javascript" src="js/js/foreground/blockui.js"></script>
<!-reload-!>

</head>
<body style='background:#ffffff'>
<script>
var PDV_PAGEID='123'; 
var PDV_RP='index.html'; 
var PDV_COLTYPE='comment'; 
var PDV_PAGENAME='main'; 
</script>

<div id='contain' style='width:900px;background:#ffffff;margin:0px auto;padding:10px'>

<div id='top' style='width:900px;height:265px;background:none transparent scroll repeat 0% 0%'>


<!-- 二级导航菜单 -->

<div id='pdv_3465' class='pdv_class'   style='width:900px;height:71px;top:60px;left:0px; z-index:1'>
<div id='spdv_3465' class='pdv_top' style='overflow:hidden;width:100%;height:100%'>
<div class="pdv_border" style="margin:0;padding:0;height:100%;border:0px  solid;background:;">
	<div style="height:25px;margin:1px;display:none;background:;">
		<div style="float:left;margin-left:12px;line-height:25px;font-weight:bold;color:">
		导航菜单
		</div>
		<div style="float:right;margin-right:10px;display:none">
		<a href="-14.html" style="line-height:25px;color:">更多</a>
		</div>
	</div>
<div style="padding:0px">


<div id="channelmenu">
<div id="channelmenumain">


	<a href="request/welcome" target="_self" class="channelmenu_main" id="channelmenu_main_0" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','0')">首页</a>

	<c:if test="${sessionScope['User'] ne null and sessionScope['User'] ne '' }">
	<a href="part/informationLoadA" target="_self" class="channelmenu_main" id="channelmenu_main_1" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','1')">医师预约</a>

	
	<a href="part/informationLoadB" target="_self" class="channelmenu_main" id="channelmenu_main_4" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','4')">专家预约</a>
	
	<a href="request/login" target="_self" class="channelmenu_main" id="channelmenu_main_5" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','5')">后台系统</a>
		<a href="user/queryOneFore?id=${sessionScope['User']['id'] }" target="_self" class="channelmenu_main" id="channelmenu_main_6" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','6')">我的信息</a>
		<a href="request/updateUserPassword?id=${sessionScope['User']['id'] }" target="_self" class="channelmenu_main" id="channelmenu_main_2" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','2')">修改密码</a>
		<a href="bargain/informationLoadFore?id=${sessionScope['User']['id'] }" target="_self" class="channelmenu_main" id="channelmenu_main_3" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','3')">我的订单</a>
	<a href="message/informationLoadFore?id=${sessionScope['User']['id'] }" target="_self" class="channelmenu_main" id="channelmenu_main_3" onMouseOver="showSubMenu('channelmenu_main','channelmenu_sub','7')">我的留言</a>
</c:if></div>
	<div id="channelmenu_sub">
		<div id="channelmenu_sub_left"></div><div id="channelmenu_sub_right"></div>
		<ul>
</ul>
<ul>
</ul>
<ul>
</ul>
<ul>
</ul>
<ul>
</ul>
<ul>
</ul>
<ul>
</ul>
<ul>
</ul>


		</div>
</div>


<script>initSubMenu('channelmenu_main','channelmenu_sub','');</script>

</div>
</div>

</div>
</div>

<!-- 网站标志 -->

<div id='pdv_3562' class='pdv_class'  title='网站标志' style='width:180px;height:70px;top:5px;left:6px; z-index:4'>
<div id='spdv_3562' class='pdv_top' style='overflow:hidden;width:100%;height:100%'>
<div class="pdv_border" style="margin:0;padding:0;height:100%;border:0px #dddddd solid;background:#fff;">
	<div style="height:25px;margin:1px;display:none;background:#cccccc;">
		<div style="float:left;margin-left:12px;line-height:25px;font-weight:bold;color:#fff">
		网站标志
		</div>
		<div style="float:right;margin-right:10px;display:none">
		<a href="-14.html" style="line-height:25px;color:#fff">更多</a>
		</div>
	</div>
<div style="padding:0px">


<h2>爱康医院专家预约系统</h2>


</div>
</div>

</div>
</div>

<!-- 商品搜索表单 -->


<!-- 购物车提示信息 -->

</div>
<div id='content' style='width:900px;height:382px;background:none transparent scroll repeat 0% 0%;margin:10px auto'>


<!-- 当前位置提示条 -->


<!-- 点评搜索表单 -->


<!-- 最新点评（列表） -->

<div id='pdv_2663' class='pdv_class'  title='最新广告' style='width:701px;height:339px;top:36px;left:199px; z-index:7'>
<div id='spdv_2663' class='pdv_content' style='overflow:hidden;width:100%;height:100%'>
<div class="pdv_border" style="margin:0;padding:0;height:100%;border:4px #eeeeee solid;background:#fff;">
	<div style="height:25px;margin:1px;display:block;background:#f0f0f0;">
		<div style="float:left;margin-left:12px;line-height:25px;font-weight:bold;color:#505050">
		我的留言
		</div>
		<div style="float:right;margin-right:10px;display:inline">
			<a href="request/messageAddFore" style="line-height:25px;color:#505050">添加</a>
		</div>
	</div>
<div style="padding:12px">


<ul class="bbslist">
	<c:if test="${mess ne null}">${mess }</c:if>
	<c:forEach items="${messageList.datas }" var="messageI" varStatus="vs">
	<li>${messageI['message'] } &nbsp;&nbsp;发布人:${messageI['userInfo']['userName'] } &nbsp;&nbsp;</li>
	</c:forEach>
</ul>

</div>
</div>

</div>
</div>

<!-- 点评分类 -->

</div>
<div id='bottom' style='width:900px;height:161px;background:none transparent scroll repeat 0% 0%'>


<!-- 底部信息编辑区 -->

<div id='pdv_3797' class='pdv_class'  title='脚注信息' style='width:900px;height:175px;top:38px;left:0px; z-index:5'>
<div id='spdv_3797' class='pdv_bottom' style='overflow:hidden;width:100%;height:100%'>
<div class="pdv_border" style="border:1px #ddd solid;height:100%;padding:0;margin:0;background:#f8f8f8">
<div style="position:relative;height:8px;line-height:8px;border:0px;padding:0;margin:-1px -1px 0px -1px;background:url(image/image/foreground/top.png) 0px 0px no-repeat;">
	<div style="float:left;width:8px;height:8px;line-height:8px;background:url(image/image/foreground/top.png) 0px 0px no-repeat">
	</div>
	<div style="float:right;width:8px;height:8px;line-height:8px;background:url(image/image/foreground/top.png) -892px 0px no-repeat">
	</div>
	
</div>

<div style="margin:0px 7px 0px 7px;padding:15px">
<div style="width:100%;text-align:center;font:12px/20px Arial, Helvetica, sans-serif">
<div style="LINE-HEIGHT: 22px">Copyright ? 2018&nbsp;All Rights Reserved. 爱康医院专家预约系统 版权所有&nbsp;&nbsp;&nbsp;<a class=icp href="http://www.miibeian.gov.cn/" target=_blank><font color=#648675>沪ICP备01234567号</font></a><br />服务时间：<span class=red><strong><font color=#ff0000>周一至周日 08:30 — 20:00</font></strong></span>&nbsp; 全国订购及服务热线：<span class=red><strong><font color=#ff0000>021-98765432</font></strong></span>&nbsp; <br />联系地址：上海市某某路某大厦20楼B座2008室&nbsp;&nbsp;&nbsp;邮政编码：210000&nbsp;&nbsp;<br /><br /><img alt="" src="image/image/foreground/200910221256198928725.gif" border=0 />&nbsp;<img alt="" src="image/image/foreground/200910221256198943820.gif" border=0 />&nbsp;<img alt="" src="image/image/foreground/200910221256198954080.gif" border=0 /></div><!# footer end -->
</div>

</div>
</div>
<div style="margin-top:-9px;height:9px;line-height:9px;background:url(image/image/foreground/top.png) 0px -98px no-repeat">&nbsp;</div>
<div style="float:right;margin-top:-9px;width:10px;height:9px;line-height:9px;background:url(image/image/foreground/top.png) -890px -98px no-repeat">&nbsp;</div>

</div>
</div>

<!-- 底部菜单（一级） -->

<div id='pdv_3750' class='pdv_class'   style='width:900px;height:38px;top:0px;left:0px; z-index:10'>
<div id='spdv_3750' class='pdv_bottom' style='overflow:hidden;width:100%;height:100%'>
<div class="pdv_border" style="border:0px;background:url(image/image/foreground/top-2.png) 0px 0px no-repeat;margin:0px;height:35px">
<div style="float:right;width:10px;height:35px;background:url(image/image/foreground/top-2.png) -890px 0px no-repeat">
</div>
<div style="margin:0px;padding:3px">


<div id="bottommenu">|

<a href="aboutus.html" target="_self">关于我们</a>|

<a href="guide.html" target="_self">购物指南</a>|

<a href="payment.html" target="_self">支付方式</a>|

<a href="dev.html" target="_self">配送说明</a>|

<a href="service.html" target="_self">售后服务</a>|

<a href="contact.html" target="_self">联系方式</a>|

<a href="index-8.html" target="_self">投诉建议</a>|

<a href="index-9.html" target="_self">诚聘英才</a>|

<a href="index-7.html" target="_self">友情链接</a>|
 
</div>


</div>
</div>

</div>
</div>
</div>
</div><div id='bodyex'>

</div>

</body>

<!-- awwwb.com -->
</html>