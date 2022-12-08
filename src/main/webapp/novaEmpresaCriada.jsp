<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<c:if test="${empty Empresa }"> 
		<h1>Nenhuma empresa para cadastrar!</h1>
	</c:if>

	<c:if test="${not empty Empresa }"> 
		<h1>Ola ${ Empresa }, CPNJ: ${CNPJ} </br> Bem Vinda! </h1>
		<a href= "FormNovaEmpresa.jsp">Cadastrar Outra empresa</a>
		<a href= "listCompany">Listar empresas</a>
	</c:if>
	
</body>
</html>