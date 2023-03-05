package org.xendra.xendrian;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.compiere.util.WebEnv;

public class LoginServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("plugin.init");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  

		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  

		String n=request.getParameter("username");  
		String p=request.getParameter("userpass");  

		if(LoginDao.validate(n, p)){  
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
			rd.forward(request,response);  
		}  
		else{  
			out.print("Sorry username or password error");  
			RequestDispatcher rd=request.getRequestDispatcher("index.html");  
			rd.include(request,response);  
		}  
		out.close();  
	}  

}
