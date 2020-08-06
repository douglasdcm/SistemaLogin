package br.com.SistemaLogin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.SistemaLogin.exception.InvalidUserException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		processRequest(request, response);
		
		
	}


	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ValidaDadosRecebidos(req);
		RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
		rd.forward(req, resp);
	
		
	}


	private void ValidaDadosRecebidos(HttpServletRequest req) throws ServletException {

		//referencia o campo usuario e senha dentro da request
		String nomeUsuario = req.getParameter("txtUsuario");
		String nomeSenha = req.getParameter("txtSenha");
		
//		if(nomeUsuario.trim().equals("") || nomeSenha.trim().equals("")) {
//			throw new ServletException("Preeencha os campos");
//		}
		//else 
		if(!nomeUsuario.trim().equals("hugo") || !nomeSenha.trim().equals("123")) {
			throw new InvalidUserException("Nome ou senha inválidos");
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("usuarioautenticado", nomeUsuario );
		
		
	}

}
