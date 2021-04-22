<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.service.*" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp" %>
<title>Lista Contatos</title>
</head>
<body>
	<%@include file="includes/session.jsp" %>
	<%
	String confirmacao = (String) request.getAttribute("confirmacao");
	if (confirmacao != null){
		out.println("<script>alert('"+confirmacao+"');</script>");
	}
	%>
	<table border="2" class="table table-stripped">
          <thead>
           <tr>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Telefone</th>
            <th>Endereço</th>
            <th>Senha</th>
           </tr>
          </thead> 
          <tbody>
           <c:forEach var="usuario" items="${Database.usuarios}">
	           <tr>
		           <td> ${usuario.getNome()}</td>
		           <td> ${usuario.getEmail()}</td>
		           <td> ${usuario.getTelefone()}</td>
		           <td> ${usuario.getEndereco()}</td>
		           <td> ${usuario.getSenha()}</td>
	           </tr>
	       </c:forEach>
          </tbody>
    </table>
</body>
</html>