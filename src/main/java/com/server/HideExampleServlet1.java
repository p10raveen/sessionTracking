package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HideExampleServlet1
 */
@WebServlet("/HideExampleServlet1")
public class HideExampleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		out.print("Hello! "+user);
		
		// hidden form field
		out.print("<form action='HideExampleServlet2'>");
		out.print("<input type='hidden' name='user100' value='"+user+"'/>");
		out.print("<input type='submit' value='Show Name'/>");
		out.print("</form>");
		
	}

}
