<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="StyleSheet"
	href="${pageContext.request.contextPath}/css/dtress.css"
	type="text/css" />
<body>
	<a href="javascript: d.openAll();">展开所有</a> |
	<a href="javascript: d.closeAll();">关闭所有</a>
	<table>
		<tr>
			<td><script type="text/javascript"
					src="${pageContext.request.contextPath}/js/dtree.js"></script> <script
					type="text/javascript">
						d = new dTree('d');
						d.add(0, -1,'后台管理');
						d.add(1,0,'用户管理');
						d.add(11,1,'用户管理','${pageContext.request.contextPath}/adminUser','','right');
						d.add(2,0,'一级管理');
						d.add(22,2,'一级管理','${pageContext.request.contextPath}/adminCategroy','','right');
						d.add(3,0,'二级管理');
						d.add(33,3,'二级管理','${pageContext.request.contextPath}/adminSecondCategroy','','right');
						d.add(4,0,'订单管理');
						d.add(44,4,'订单管理','${pageContext.request.contextPath}/adminOrder','','right');
						d.add(5,0,'商品管理');
						d.add(55,5,'商品管理','${pageContext.request.contextPath}/adminProduct','','right');
						document.write(d);
					</script></td>
		</tr>
	</table>
</body>
</html>