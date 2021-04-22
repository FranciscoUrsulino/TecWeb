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
		<form action="loginServlet" method="POST">
			<label for="email">E-mail</label>
			<input id="email" name="email" type="email" placeholder="Informe seu e-mail" >
			<br/>
			<br/>
			<label for="password">Password</label>
			<input id="password" name="password" type="password" placeholder="Informe seu password" >
			<br/>
			<br/>
			<input type="submit" value="Login" id="btn-Login">
		</form>
	</div>
</body>
</html>