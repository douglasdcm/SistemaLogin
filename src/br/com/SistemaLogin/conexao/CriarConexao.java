package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Conectado");
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemaLogin?useTimezone=true&serverTimezone=UTC", "root", "123456");
		}catch(SQLException e) {
			throw new SQLException(e);
		}catch(ClassNotFoundException e1) {
			throw new SQLException(e1);
		}
	}
	
}
