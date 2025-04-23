<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%
   String path = request.getContextPath();
   String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   /*
   @Author:Jaylan Zhou,Liu lu
   @Date:2016.12.10
   @projectName:金众传媒业务信息系统
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
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basepath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href=" css/css/background/css/style.css" rel="stylesheet"
	type="text/css" />
<link href="css/css/background/css/select.css" rel="stylesheet"
	type="text/css" />
<link href="js/js/background/js/laydate/need/laydate.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="js/js/background/js/laydate/laydate.js"></script>
<script type="text/javascript" src="js/js/background/js/jquery.js"></script>
<script type="text/javascript"
	src="js/js/background/js/jquery.idTabs.min.js"></script>
<script type="text/javascript"
	src="js/js/background/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="js/js/background/editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>

<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body>


	<div class="formbody">


		<div id="usual1" class="usual">

			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">发布信息</a></li>
				</ul>
			</div>

			<div id="tab1" class="tabson">

				<div class="formtext">
					Hi，<b>${sessionScope['Admin']['userName']}</b>，欢迎您使用信息编辑功能！
				</div>

				<!-- form表单 -->

				<form action="information/informationUpdate" method="POST"
					onsubmit="return checkSubmit();">
					<input type="hidden" name="id" value="${information['id'] }">
					<ul class="forminfo">
						<li><label>车次编号<b>*</b></label><input id="number" value="${information['number'] }"
							name="number" type="text" class="dfinput" placeholder="请填写车次编号"
							style="width: 518px;" /></li>
						<li><label>车次名称<b>*</b></label><input id="name" value="${information['name'] }"
							name="name" type="text" class="dfinput" placeholder="请填写车次名称"
							style="width: 518px;" /></li>
						<li><label>起始地<b>*</b></label><input id="start" value="${information['start'] }"
							name="start" type="text" class="dfinput" placeholder="请填写起始地"
							style="width: 518px;" /></li>
						<li><label>目的地<b>*</b></label><input id="end" value="${information['end'] }"
							name="end" type="text" class="dfinput" placeholder="请填写目的地"
							style="width: 518px;" /></li>
						<li><label>起始时间<b>*</b></label><input id="start_time" value="${information['start_time'] }"
							name="start_time" type="text" class="dfinput" placeholder="请填写起始时间"
							style="width: 518px;" /></li>
						<li><label>到达时间<b>*</b></label><input id="end_time" value="${information['end_time'] }"
							name="end_time" type="text" class="dfinput" placeholder="请填写到达时间"
							style="width: 518px;" /></li>
						<li><label>价格<b>*</b></label><input id="price" value="${information['price'] }"
							name="price" type="text" class="dfinput" placeholder="请填写价格"
							style="width: 518px;" /></li>
						<li><label>&nbsp;</label><input name="" type="submit"
							class="btn" value="修改信息" /></li>
					</ul>

				</form>
			</div>

		</div>

		<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>

		<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>





	</div>


</body>
<script type="text/javascript"> 
var start_time = {
		  elem: '#start_time',
		  format: 'YYYY-MM-DD',
		  min: '1900-01-01', //设定最小日期为当前日期
		  max: '2099-06-16', //最大日期
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		     end.min = datas; //开始日选好后，重置结束日的最小日期
		     end.start = datas //将结束日的初始值设定为开始日
		  }
		};
var end_time = {
		  elem: '#end_time',
		  format: 'YYYY-MM-DD',
		  min: '1900-01-01', //设定最小日期为当前日期
		  max: '2099-06-16', //最大日期
		  istime: true,
		  istoday: false,
		  choose: function(datas){
		     end.min = datas; //开始日选好后，重置结束日的最小日期
		     end.start = datas //将结束日的初始值设定为开始日
		  }
		};
		laydate(start_time);
		laydate(end_time);
    var checkSubmitFlg = false; 
    function checkSubmit() { 
      if (checkSubmitFlg == true) { 
         return false; 
      } 
      var name = $("#name").val();
      var number = $("#number").val();
      var start = $("#start").val();
      var end = $("#end").val();
      var start_time = $("#start_time").val();
      var end_time = $("#end_time").val();
      var price = $("#price").val();
		if(!$.trim(name)){
			alert('请输入车次名称!');
			return false;
		}
        if(!$.trim(number)){
            alert('请输入车次编号!');
            return false;
        }
        if(!$.trim(start)){
            alert('请输入起始地!');
            return false;
        }
        if(!$.trim(end)){
            alert('请输入目的地!');
            return false;
        }
        if(!$.trim(start_time)){
            alert('请输入起始时间!');
            return false;
        }
        if(!$.trim(end_time)){
            alert('请输入到达时间!');
            return false;
        }
        if(!$.trim(price)){
            alert('请输入价格!');
            return false;
        }
      checkSubmitFlg = true;
      return true; 
   } 
   document.ondblclick = function docondblclick() { 
    window.event.returnValue = false; 
   } 
   document.onclick = function doconclick() { 
       if (checkSubmitFlg) { 
         window.event.returnValue = false; 
       } 
   } 
</script>
</html>
