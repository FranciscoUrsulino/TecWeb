<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<%-- <% String user = (String) request.getAttribute("user"); %>
	<div align="center">
		<p align="center">Seja bem vindo, Sr. <%=user%></p>
	</div> --%>
	
	<div align="center">
		<c:if test="${user != null}">
			<p>Seja bem vindo, Sr. <strong>${user}</strong>  </p>
		</c:if>
	</div>
	
	<div align="center">
		<c:if test="${client != null}">
			<p>Nome<strong>${client.name}</strong>  </p>
			<p>E-mail<strong>${client.email}</strong>  </p>
			<p>Phone<strong>${client.phone}</strong>  </p>
		</c:if>
	</div>
</body>
</html>