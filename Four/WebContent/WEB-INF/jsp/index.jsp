<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="/struts-tags"  prefix="s"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>传智商城</title>
<script language="javascript">
function hotItemdetail(){
   /*  document.hotproduct.action="{pageContext.request.contextPath}/itemdetail";
    document.hotproduct.submit(); */
   /*   document.getElementById("hotproduct").submit();  */
  
}
function newItemdetail(){
	/* document.getElementsByName("newproduct").submit(); */
/* 	document.getElementsByTagName("newproduct").submit(); */
	 
}
/* function createXmlHttp(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }

		return xmlHttp;
	 } */
</script>
<link href="${pageContext.request.contextPath}/css/slider.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/common.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/index.css"
	rel="stylesheet" type="text/css" />

</head>
<body>

	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a href="./网上商城/index.htm"> <img
					src="${pageContext.request.contextPath}/image/r___________renleipic_01/logo.gif"
					alt="传智播客" />
				</a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="${pageContext.request.contextPath}/image/header.jpg"
					width="320" height="50" alt="正品保障" title="正品保障" />
			</div>
		</div>

		<%@ include file="menu.jsp"%>

	</div>

	<div class="container index">
		<%-- <div>
<c:forEach items="${hotproduct}" var="p">
<ul class="tabContent">
<li><img src="${pageContext.request.contextPath}/${p.image}"/></li>
</ul>
</c:forEach>
</div> --%>


		<div class="span24">
			<div id="hotProduct" class="hotProduct clearfix">
				<div class="title">
					<strong>热门商品</strong> <a target="_blank"></a>
				</div>
				<%-- <table width="100%" border="1">
					<tr>
						<td>商品名称</td>
						<td>市场价格</td>
						<td>商店价格</td>
						<td>发布时间</td>
						<!--  <td>图片</td>  -->
					</tr>
					<c:forEach items="${hotproduct}" var="h">
						<tr>
							<td>${h.pname}</td>
							<td>${h.market_price}</td>
							<td>${h.shop_price}</td>
							<td>${h.pdate}</td>
							<td><img src="${pageContext.request.contextPath}/${p.image}"/></td> 
						</tr>
					</c:forEach>
				</table> --%>
				<div class="tabContent" style="display: block;">
					<c:forEach items="${hotproduct}" var="h">
						<ul>
							<li>
							<form id="hotproduct" action="${pageContext.request.contextPath}/productdetail">
							<input type="hidden" value="${h.pid}" name="pid"/>
						<input type="image" src="${pageContext.request.contextPath}/${h.image}" style="width:175px;height:240px"/>
						<%-- 	<img name="image" src="${pageContext.request.contextPath}/${h.image}" onclick="javascript:hotItemdetail();"  /> --%>
							</form></li>
							
						</ul>
					</c:forEach>
				</div>

			</div>
		</div>
		<div class="span24">
			<div id="newProduct" class="newProduct clearfix">
				<div class="title">
					<strong>最新商品</strong> <a target="_blank"></a>
				</div>
				<%-- <table width="100%" border="1">
					<tr>
						<td>商品名称</td>
						<td>市场价格</td>
						<td>商店价格</td>
						<td>发布时间</td>
						<!--  <td>图片</td>  -->
					</tr>
					<c:forEach items="${newproduct}" var="n">
						<tr>
							<td>${n.pname}</td>
							<td>${n.market_price}</td>
							<td>${n.shop_price}</td>
							<td>${n.pdate}</td>
							<td><img src="${pageContext.request.contextPath}/${p.image}"/></td> 
						</tr>
					</c:forEach>
				</table> --%>
				<div class="tabContent" style="display: block;">
					<c:forEach items="${newproduct}" var="n">
						<ul>
							<li>
							<form id="newproduct"  action="${pageContext.request.contextPath}/productdetail">
							<input type="hidden" value="${n.pid }" name="pid"/>
							<input type="image" name="image" src="${pageContext.request.contextPath}/${n.image}"style="width:175px;height:240px" />
							</form>>
							</li>
						</ul>
					</c:forEach>
				</div>
			</div>
		</div>
		<div class="span24">
			<div class="friendLink">
				<dl>
					<dt>新手指南</dt>
					<dd>
						<a target="_blank">支付方式</a> |
					</dd>
					<dd>
						<a target="_blank">配送方式</a> |
					</dd>
					<dd>
						<a target="_blank">售后服务</a> |
					</dd>
					<dd>
						<a target="_blank">购物帮助</a> |
					</dd>
					<dd>
						<a target="_blank">蔬菜卡</a> |
					</dd>
					<dd>
						<a target="_blank">礼品卡</a> |
					</dd>
					<dd>
						<a target="_blank">银联卡</a> |
					</dd>
					<dd>
						<a target="_blank">亿家卡</a> |
					</dd>

					<dd class="more">
						<a>更多</a>
					</dd>
				</dl>
			</div>
		</div>
	</div>
	<div class="container footer">
		<div class="span24">
			<div class="footerAd">
				<img src="${pageContext.request.contextPath}/image/footer.jpg"
					width="950" height="52" alt="我们的优势" title="我们的优势">
			</div>
		</div>
		<div class="span24">
			<ul class="bottomNav">
				<li><a>关于我们</a> |</li>
				<li><a>联系我们</a> |</li>
				<li><a>招贤纳士</a> |</li>
				<li><a>法律声明</a> |</li>
				<li><a>友情链接</a> |</li>
				<li><a target="_blank">支付方式</a> |</li>
				<li><a target="_blank">配送方式</a> |</li>
				<li><a>服务声明</a> |</li>
				<li><a>广告声明</a></li>
			</ul>
		</div>
		<div class="span24">
			<div class="copyright">Copyright © 2005-2015 网上商城 版权所有</div>
		</div>
	</div>
</body>
</html>