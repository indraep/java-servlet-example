package com.indraep.controller;

import com.indraep.service.ApiService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by indraep on 10/15/17.
 */
public class ApiServlet extends HttpServlet {
  private static final long serialVersionUID = -4751096228274971485L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
	PrintWriter out = response.getWriter();

	out.print(new ApiService().processApi());
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