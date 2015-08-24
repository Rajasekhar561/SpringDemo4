package com.sarvah;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Sample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Sample1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Calendar calendar=new GregorianCalendar();
		int hour=calendar.get(Calendar.HOUR);
		int min=calendar.get(Calendar.MINUTE);
		int sec=calendar.get(Calendar.SECOND);
		String am_pm;
		if(calendar.get(Calendar.AM_PM) == 0)
			am_pm="AM";
		else am_pm="PM";
		String C=hour+":"+min+":"+sec+":"+am_pm;
		PrintWriter out=response.getWriter();
		out.println("<html><body>"
				+ "Current Time:"+C+"</body></html>");
		
			
		
	}

}
