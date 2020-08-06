package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.SistemaLogin.login.Login;
import br.com.SistemaLogin.login.LoginDAO;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection con = CriarConexao.getConnection();
	
		Login l = new Login();
		l.setUsuario("hugoFreitas");
		l.setSenha("12345");
		
		LoginDAO dao = new LoginDAO(con);
		dao.adicionar(l);
		
		
	}
	
}
