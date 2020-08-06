<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Cadastrar login</h2>
	<form name="frmCadastarLogin" action="CadastroLogin" method="post">
		<table>


			<tr>
				<td>Usuário:</td>
				<td><input type="text" name="txtUsuario" /></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="txtSenha" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Cadastrar" /></td>
			</tr>


		</table>
	</form>
</body>
</html>