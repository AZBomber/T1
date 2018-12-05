<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri="/struts-tags" prefix="s"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0048)http://localhost:8080/mango/product/list/1.jhtml -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>传智网上商城</title>
<link href="${pageContext.request.contextPath}/css/common.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/product.css"
	rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="container header">
		<div class="span5">
			<div class="logo">
				<a href="http://localhost:8080/mango/"> <img
					src="${pageContext.request.contextPath}/image/r___________renleipic_01/logo.gif"
					alt="传智播客"></a>
			</div>
		</div>
		<div class="span9">
			<div class="headerAd">
				<img src="${pageContext.request.contextPath}/image/header.jpg"
					width="320" height="50" alt="正品保障" title="正品保障">
			</div>
		</div>

		<%@ include file="menu.jsp"%>

	</div>
	<div class="container productList">
		<div class="span6">
			<div class="hotProductCategory">
				<c:forEach items="${categroy}" var="ccc">
					<dl>
						<dt>${ccc.cname}</dt>
						<c:forEach items="${ categroyAndSeconds}" var="cate">
							<c:if test="${ccc.cid==cate.cid}">
								<dd>
									<a
										href="${pageContext.request.contextPath}/findbycsid?csid=${cate.csid}&nowpage=1">${cate.csname}</a>
								</dd>
							</c:if>
						</c:forEach>
					</dl>
				</c:forEach>
			</div>
		</div>
		<div class="span18 last">

			<form id="productForm"
				action="${pageContext.request.contextPath}/image/蔬菜 - Powered By Mango Team.htm"
				method="get">

				<div id="result" class="result table clearfix">
					<ul>
						<c:forEach items="${ pagelist}" var="pl">
							<li><a
								href="${pageContext.request.contextPath}/productdetail?pid=${pl.pid}">
									<img src="${pl.image}" width="170" height="170"
									style="display: inline-block;" /> <span style='color: green'>

										<c:out value="${pl.pname}" />
								</span> <span class="price"> 商城价： ￥<c:out
											value="${pl.shop_price }" />
								</span>

							</a></li>
						</c:forEach>

					</ul>
				</div>
				<div class="pagination">
					<c:if test="${page.csid==0}">
						<c:if test="${page.nowpage!=1}">
							<a
								href="${pageContext.request.contextPath}/productlist?nowpage=${page.nowpage-1}&cid=${page.cid}">上一页</a>
						</c:if>
						<span>第 ${page.nowpage}/${page.pagecount} 页</span>
						<c:if test="${page.pagecount!=page.nowpage}">
							<a
								href="${pageContext.request.contextPath}/productlist?nowpage=${page.nowpage+1}&cid=${page.cid}">下一页</a>
						</c:if>
					</c:if>
					<c:if test="${page.csid!=0}">
						<c:if test="${page.nowpage!=1}">
							<a
								href="${pageContext.request.contextPath}/findbycsid?nowpage=${page.nowpage-1}&csid=${page.csid}">上一页</a>
						</c:if>
						<span>第 ${page.nowpage}/${page.pagecount} 页</span>
						<c:if test="${page.pagecount!=page.nowpage}">
							<a
								href="${pageContext.request.contextPath}/findbycsid?nowpage=${page.nowpage+1}&csid=${page.csid}">下一页</a>
						</c:if>
					</c:if>
					<%-- <c:if test="cid != null">
			<c:if test="pageBean.page != 1">
				<a href="">&nbsp;</a>
				<a href="">&nbsp;</a>
			</c:if>
			
			<s:iterator var="i" begin="1" end="pageBean.totalPage">
				<c:if test="pageBean.page != #i">
					<a href=""/></a>
				</c:if>
				<c:else>
					<span class="currentPage"><s:property value="#i"/></span>
				</c:else>
			</s:iterator>
			
			<c:if test="pageBean.page != pageBean.totalPage">	
				<a class="nextPage" href="">&nbsp;</a>
				<a class="lastPage" href="">&nbsp;</a>
			</c:if> --%>
					<%-- 	</c:if>	
		<c:if test="csid != null">
			<c:if test="pageBean.page != 1">
				<a href="">&nbsp;</a>
				<a href="">&nbsp;</a>
			</c:if>
			
			<s:iterator var="i" begin="1" end="pageBean.totalPage">
				<c:if test="pageBean.page != #i">
					<a href=""/></a>
				</c:if>
				<c:else>
					<span class="currentPage"><s:property value="#i"/></span>
				</c:else>
			</s:iterator>
			
			<c:if test="pageBean.page != pageBean.totalPage">	
				<a class="nextPage" href="">&nbsp;</a>
				<a class="lastPage" href=""/>">&nbsp;</a>
			</c:if>
		</c:if>	 --%>
				</div>
			</form>
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
				<li><a>诚聘英才</a> |</li>
				<li><a>法律声明</a> |</li>
				<li><a>友情链接</a> |</li>
				<li><a target="_blank">支付方式</a> |</li>
				<li><a target="_blank">配送方式</a> |</li>
				<li><a>官网</a> |</li>
				<li><a>论坛</a></li>
			</ul>
		</div>
		<div class="span24">
			<div class="copyright">Copyright©2005-2015 网上商城 版权所有</div>
		</div>
	</div>
</body>
</html>