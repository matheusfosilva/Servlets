<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="link" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${link}"  method="post">
		
		Nome: <input type= "text" name= "nome"/>
		<input type= "submit" /> 
	
	</form>

</body>
</html>