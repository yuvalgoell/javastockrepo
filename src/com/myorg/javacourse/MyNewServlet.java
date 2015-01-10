package com.myorg.javacourse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyNewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		resp.setContentType("text/html");
		
		int radius=50;
		double area= Math.PI*Math.pow(radius, 2);
		int angleB=30;
		int hypotenuse=50;
		double opposite= Math.sin(Math.toRadians(angleB))*hypotenuse;
        double power= Math.pow(20, 13);
        
        String line1= new String ("<b>Area of circle with radius</b> " + "<H1 style=color:green>"+radius+"</H1>" +  " <b>is</b>" +area+ " <b>square-cm</b>");
		String line2= new String ("<b>Length of oppsite where angle B is 30 degrees and Hypotenuse length is 50 cm is:</b>" +opposite+ " <b>cm</b>");
		String line3= new String ("<b>Power of 20 with exp of 13 is:</b>" + power);
		
		String resultStr= line1 + "<br>" + line2 + "<br>" +line3;
		resp.getWriter().println(resultStr);
		
	
		
		
		
		
	
		
		 
		
		
		
				
		
		
		
	}

}
