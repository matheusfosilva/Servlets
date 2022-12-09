<%@page import="br.com.sdconecta.manager.classes.Empresa"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standart Library</title>
</head>
<body>

	<div>Lista de Empresas:</div>

	<ul>
		<c:forEach items="${list}" var="empresa">
			<li> ${empresa.id} --  Nome da empresa: ${empresa.nome}  |  CNPJ: ${empresa.cnpj}  |  Data de criação: ${empresa.data}--------------   
			|<a href="removeCompany?id=${empresa.id}"  >excluir</a>  |<a href=  >editar</a> </li>
		</c:forEach>
	</ul>
	<a href= "FormNovaEmpresa.jsp">Cadastrar Outra empresa</a>
	

</body>
</html>