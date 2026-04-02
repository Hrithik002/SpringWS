<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href='style.css' rel='stylesheet'>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h3>SignIn</h3>
	<div>
		<form action="dologin" method="post">
			<div>
				<label>Login</label> <input type="text" name='lg'>
			</div>
			<div>
				<label>Password</label> <input type="password" name='pw'>
			</div>
			<div>
				<button>Submit</button>
			</div>
			<div> <p> ${msg}></p></div>
		</form>
	</div>
</body>
</html>