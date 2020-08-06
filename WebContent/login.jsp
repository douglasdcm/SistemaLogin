<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Login</title>
<script type="text/javascript" src="validarcampos.js">


</script>
</head>
<body>
	<form action="Login" method="post" name="formLogin">
		<p align="center">
		<table cellpadding="7">
			<tr>
				<td>Usuário: </td>
				<td><input type="text" name="txtUsuario" /></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="password" name="txtSenha" /></td>
			</tr>
				<tr>
				<td colspan="2" align="center"><input type="submit" value="Logar" onclick="validarLogin()"/></td>
			</tr>



		</table>

	</form>
</body>
</html>