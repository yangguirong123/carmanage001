<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
	<table width="100%" border="0" bgcolor="#cccccc">
		<tr>
			<td>姓名</td>
			<td>学号</td>
			<td>年龄</td>
			<td colspan="2">操作</td>
		</tr>

		<%
			String color = "";
			int c = 1;
		%>
		<c:forEach items="${carList}" var="car">
			<%
				if (c == 1) {
						color = "#ffffff";
						c = 0;
					} else {
						color = "#f5f5f5";
						c = 1;
					}
			%>
			<tr bgcolor="<%=color%>">
				<td>${car.carNumber}</td>
				<td>${car.carName}</td>
				<td>${car.persenName}</td>
				<td>${car.telephone}</td>
				<td>${car.address}</td>
				<td><a href="./delete.do?id=${car.id }">删除</a></td>
				<td><a href="#">修改</a></td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>