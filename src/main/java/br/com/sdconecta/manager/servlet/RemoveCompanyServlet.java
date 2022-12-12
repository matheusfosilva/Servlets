package br.com.sdconecta.manager.servlet;

import java.io.IOException;
import java.util.List;

import br.com.sdconecta.manager.classes.Banco;
import br.com.sdconecta.manager.classes.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveCompanyServlet
 */
public class RemoveCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		new Banco().removeEmpresa(Integer.valueOf( request.getParameter("id") ));
		response.sendRedirect("listCompany");
	}

}
