<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="style.jsp" />
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h3>Contacts</h3>
	<table border="1" class="mytab">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<c:forEach items="${contacts}" var="c">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td>${c.email}</td>
				</tr>
			</c:forEach>
			<form action="" method="">
				<tr>
					<td><input type='text' name='id'></td>
					<td><input type='text' name='name'></td>
					<td><input type='text' name='price'></td>
				</tr>
				<tr>
					<th colspan='3'><button>Add</button>
				</tr>
			</form>
	</table>
</body>
</html>