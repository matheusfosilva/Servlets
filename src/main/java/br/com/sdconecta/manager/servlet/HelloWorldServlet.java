package br.com.sdconecta.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {

		PrintWriter writer = arg1.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<div>");
		writer.println("It's Works!!!!!! First servlets rocks!");
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
