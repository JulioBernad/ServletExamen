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
			String lenguaEscrita = req.getParameter("lengua");
			String lenguaCom = req.getParameter("cLengua");
			
			req.setAttribute("pa",pais);
			req.setAttribute("lengua",lenguaEscrita);
			req.setAttribute("cLengua",lenguaCom);
			
			Servicios.crearTabla();
			
			if(lenguaEscrita == ""){
				Servicios.insertarPais(pais, lenguaCom);
			}
			else{
				Servicios.insertarPais(pais, lenguaEscrita);
				Servicios.insertarLengua(lenguaEscrita);
			}
			


			req.getRequestDispatcher("Inicio.jsp").forward(req, resp);
			super.doPost(req, resp);
		}

		private void redirect(HttpServletResponse resp) throws IOException {
			resp.sendRedirect("Inicio.jsp");
		}
}
