package com.hanshin.database;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myforward")
public class myforward extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet ½ÇÇà µÊ");
		
		String num1, num2 = null;
		num1 = req.getParameter("num1");
		num2 = req.getParameter("num2");
				
		RequestDispatcher rd = req.getRequestDispatcher("myjspexample3.jsp");
		req.setAttribute("num1", num1);
		req.setAttribute("num2", num2);
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}
