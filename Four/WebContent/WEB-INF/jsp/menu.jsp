<%-- <%@page import="pojo.Categroy"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="span10 last">
	<div class="topNav clearfix">
		<ul>
			<s:if test="#session.existUser == null">
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<c:if test="${uid==null}">
						<a href="${ pageContext.request.contextPath }/gotologin">登录</a>
					</c:if> <c:if test="${uid!=null}">
					<a href="">	<c:out value="${name}" /></a>
					</c:if>
				</li>
				<li id="headerRegister" class="headerRegister"
					style="display: list-item;"><c:if test="${uid==null}">
						<a href="${ pageContext.request.contextPath }/gotoregist">注册</a>
					</c:if></li>
			</s:if>
			<s:else>
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<s:property value="#session.existUser.name" /> |
				</li>
				<li id="headerLogin" class="headerLogin" style="display: list-item;">
					<a
					href="${ pageContext.request.contextPath }/MyOrder">我的订单</a>
					|
				</li>
				<li id="headerRegister" class="headerRegister"
					style="display: list-item;"><a
					href="${ pageContext.request.contextPath }/exit">退出</a>|
				</li>
			</s:else>

			<li><a>会员中心</a> |</li>
			<li><a>购物指南</a> |</li>
			<li><a>关于我们</a></li>
		</ul>
	</div>
	<div class="cart">
		<a href="${ pageContext.request.contextPath }/BuyAndOrder">购物车</a>
	</div>
	<div class="phone">
		客服热线: <strong>96008/53277764</strong>
	</div>
</div>
<div class="span24">
	<ul class="mainNav">
		<li><a href="${pageContext.request.contextPath}/index">首页</a> |</li>
		<c:forEach items="${categroy}" var="h">
			<li>
				<%-- <form action="${pageContext.request.contextPath}/productlist">
		<input type="hidden" name="cid" value="${h.cid}">
		<input type="submit" value="${h.cname}">
		</form> --%> <a
				href="${pageContext.request.contextPath}/productlist?cid=${h.cid}&nowpage=1" />
				<c:out value="${h.cname}" /></a>
			</li>
		</c:forEach>

	</ul>
</div>