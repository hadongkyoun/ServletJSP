<%@ page language="java" contentType="text/html; charset=UTF-8" isErrorPage="true"%>


<!DOCTYPE html>
<html>
<head>
<title>pageContext</title>
</head>
<body>
	<%!	
		
		public void work(String p, PageContext pc) {
		
		try{
			JspWriter out = pc.getOut();	
			if(p.equals("include")){
				out.print("-- include 전 -- <br>");
				pc.include("test.jsp");
				out.print("-- include 후 -- <br>");
			} else if (p.equals("forward")){
				pc.forward("test.jsp");
			}
		}catch(Exception e){
				
		}
	}%>
	
	<%
		String p = request.getParameter("p");
		this.work(p, pageContext);
	%>
</body>
</html>