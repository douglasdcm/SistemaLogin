<%@ page isErrorPage="true" %>
<%@ page import="java.util.Enumeration" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro de Login</title>
<!-- colocar css aqui -->
</head>
<body>
<div align="center">
<div id="cabecaljo">
Cabeçalho
</div>
<div id="corpo">
<img src="image/index.jpg" />
<hr/>
Error: <%=exception.getMessage() %><br/>
Exceção ocorrida: <%=exception.getClass() %><br/>
<hr/>
<a href="login.jsp">Tentar novamente</a>
</div>
<div id="rodape">
Rodapé
</div>
</div> 
</body>
</html>