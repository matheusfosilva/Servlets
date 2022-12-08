package br.com.sdconecta.manager.servlet;

import java.io.IOException;
import java.time.LocalDate;

import br.com.sdconecta.manager.classes.Banco;
import br.com.sdconecta.manager.classes.Empresa;
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
		
		banco.add( 
				new Empresa( banco.getEmpresas().size()+1 , 
				request.getParameter("nome"),
				Integer.valueOf(request.getParameter("cnpj") ) , 
				LocalDate.now()));
		
//		response.sendRedirect("listCompany"); -> Mandar um link para que o próprio navegador redirecione a page 

		request.setAttribute("Empresa", request.getParameter("nome") );
		request.setAttribute("CNPJ", request.getParameter("cnpj") );
		request.getRequestDispatcher("/novaEmpresaCriada.jsp").forward(request, response);

	}

}
