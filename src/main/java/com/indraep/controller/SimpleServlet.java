package com.indraep.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by indraep on 10/15/17.
 */
public class SimpleServlet extends HttpServlet {
  private static final long serialVersionUID = -4751096228274971485L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

	rd.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest reqest, HttpServletResponse response)
	  throws ServletException, IOException {
	response.getWriter().println("Hello World!");
  }
  @Override
  public void init() throws ServletException {
	System.out.println("Servlet " + this.getServletName() + " has started");
  }
  @Override
  public void destroy() {
	System.out.println("Servlet " + this.getServletName() + " has stopped");
  }
}
