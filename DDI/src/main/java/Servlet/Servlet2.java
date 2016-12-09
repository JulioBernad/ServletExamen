package Servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Services;

public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lengua = req.getParameter("lengua");
		//System.out.println(user);
		
		req.setAttribute("lengua",lengua);
		
		
		Services.BorrarTabla(lengua);
		
		redirect(resp);
		super.doPost(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String lengua = req.getParameter("lengua");
		//System.out.println(user);
		req.setAttribute("lengua",lengua);
		
		//JavaConexion.crearTabla();
		Services.BorrarTabla(lengua);
		
		redirect(resp);
		super.doPost(req, resp);
	}

	private void redirect(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("aviso.jsp");
	}
}
