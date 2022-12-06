package br.com.sdconecta.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		banco.add( new Empresa( request.getParameter("nome") ) );
		
		
		request.setAttribute("Empresa", request.getParameter("nome") );
		request.getRequestDispatcher("/novaEmpresaCriada.jsp").forward(request, response);
		
	}
 
}
