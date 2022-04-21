package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		try {
			String getquery = req.getQueryString();
			out.print("Query :"+getquery+"<br>");
			out.print("Query 길이 : "+getquery.length());
			out.print("Done!");
		}catch(NullPointerException e) {
			System.out.println("null 참조 오류발생");
		}
		out.close();
	}
}
