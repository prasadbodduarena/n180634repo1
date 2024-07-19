package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get the print writer
	PrintWriter pw=resp.getWriter();
	//set response content type
	resp.setContentType("text/html");
	//write b.logics
	Date d=new Date();
	//write the response 
	pw.println("<h2 style='color:red;text-align:center'>Date and Time ::"+d+"</h2>");
	//add home hyper link 
	pw.println("<br><a href='index.jsp'>Home</a>");
	//close the stream
	pw.close();
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
