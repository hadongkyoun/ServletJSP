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
		}catch(Exception e) {
			out.println("요청을 처리하는 동안 오류가 발생하였습니다 : "+ e);
		}
		out.print("<br>Done!");
		out.close();
	}
}
