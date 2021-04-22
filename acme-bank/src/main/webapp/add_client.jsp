<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Login Usuário</h2>
		<br/>
		<form action="clientServlet" method="POST">
			<label for="name">Name</label>
			<input id="name" name="name" type="text" placeholder="your name" >
			<br/>
			<br/>
			<label for="email">E-mail</label>
			<input id="email" name="email" type="email" placeholder="your email" >
			<br/>
			<br/>
			<label for="phone">Phone</label>
			<input id="phone" name="phone" type="text" placeholder="your phone" >
			<br/>
			<br/>
			<input type="submit" value="Add" id="btn-Login">
		</form>
	</div>
</body>
</html>