package br.com.sdconecta.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.sdconecta.manager.classes.Banco;
import br.com.sdconecta.manager.classes.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListCompanyServlet
 */
public class ListCompanyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> company = new Banco().getEmpresas();
		
		
		//Enviando informações como atributos
		request.setAttribute("list", company);
		
		//Despachando para a View de listar empresas 
		request.getRequestDispatcher("/listarEmpresas.jsp").forward(request, response); 
		
	}

}
