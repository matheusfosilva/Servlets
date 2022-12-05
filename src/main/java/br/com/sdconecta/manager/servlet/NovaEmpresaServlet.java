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

		System.out.println("Cadastrando nova empresa");
		String nome = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		
		Banco banco = new Banco();
		banco.add(empresa);
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><header>Ola, " + nome +", Bem Vinda! </header> <body><div>Empresa " + nome + " cadastrada!</div></body></html>");
		
	}

}
