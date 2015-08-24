package com.sarvah;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LoginServlet.class);
		String Username=request.getParameter("userName");
		request.setAttribute(Username, "Message");
		String Password=request.getParameter("password");
		logger.info("Login started");
       if(Username.equalsIgnoreCase("Java")){
    	   logger.info(" valide Username");
    	   
    	   System.out.println("Login sucess");
    	  /* RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
    	   rd.forward(request, response);*/
       }else{
    	   logger.error("Login failed");
    	   System.out.println("Login in failed");
       }
		
		
	}

}
