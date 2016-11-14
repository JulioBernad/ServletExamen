package es.salesianos.edu.DDI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletIni extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String pais = req.getParameter("pa");
			String lenguaEscrita = req.getParameter("lengua2");
			
			req.setAttribute("nam",pais);
			req.setAttribute("lengua2",lenguaEscrita);
			
			Servicios.crearTabla();
			Servicios.insertarTabla(pais, lenguaEscrita);

			req.getRequestDispatcher("Fin.jsp").forward(req, resp);
			super.doPost(req, resp);
		}

		private void redirect(HttpServletResponse resp) throws IOException {
			resp.sendRedirect("Fin.jsp");
		}
}