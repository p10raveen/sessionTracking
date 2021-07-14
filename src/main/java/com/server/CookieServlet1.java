package com.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet1
 */
@WebServlet("/CookieServlet1")
public class CookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		out.println("Hello "+ user);
		
		// Creating two cookies
		Cookie c1 = new Cookie("userName",user);
		Cookie c2 = new Cookie("userPassword",pass);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		out.println("<a href='CookieServlet2' >View Details</a>");
	}

}
