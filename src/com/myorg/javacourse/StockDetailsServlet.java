package com.myorg.javacourse;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockDetailsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		resp.setContentType("text/html");
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2014, 11, 15);
		Stock pih =  new Stock("PIH", 13.1f, 12.4f, cal.getTime());
		Stock aal =  new Stock("AAL", 5.78f, 5.5f,  cal.getTime());
		Stock caas = new Stock("CAAS",32.2f, 31.5f, cal.getTime());
		
		resp.getWriter().println(pih.getHtmlDescription() + "<br>" + aal.getHtmlDescription() + "<br>" + caas.getHtmlDescription()); 
	}

}
