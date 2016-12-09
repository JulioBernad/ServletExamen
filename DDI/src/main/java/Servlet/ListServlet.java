package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;
import Service.*;

public class ListServlet extends HttpServlet {
	List<Country> listAllCountries= new ArrayList<Country>();
	private Services service = new Services();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllCountries = service.listAllCountries();
		req.setAttribute("listAllCountries", listAllCountries);
		redirect(req,resp);
	}

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ShowCountries.jsp");
		dispatcher.forward(req,resp);
	}
}