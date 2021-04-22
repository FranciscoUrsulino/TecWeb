<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>
<%-- <% String user = (String) request.getAttribute("user"); %>
	<div align="center">
		<p align="center">Seja bem vindo, Sr. <%=user%></p>
	</div> --%>
	
	<div align="center">
		<c:if test="${email != null}">
			<p>O usuário  <strong>${email}</strong>  Já foi utilizado, favor utilizar outro e-mail!!!</p>
		</c:if>
	</div>
		
</body>
</html>