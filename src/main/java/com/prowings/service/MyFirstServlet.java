package com.prowings.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to Pro Wings - servlet session");
		pw.println("</body></html>");
		
		pw.println("<html><body>");
		pw.println("Hello Shubham");
		pw.println("</body></html>");

		pw.close();// closing the stream
	}

}
