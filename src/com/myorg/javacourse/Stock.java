package com.myorg.javacourse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stock {
	private String symbol;
	private float ask;
	private float bid;
	private Date date;
	
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getAsk() {
		return ask;
	}
	public void setAsk(float ask) {
		this.ask = ask;
	}
	public float getBid() {
		return bid;
	}
	public void setBid(float bid) {
		this.bid = bid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Stock(String symbol1,float ask1,float bid1,Date date1){
		this.ask= ask1;
		this.bid= bid1;
		this.symbol= symbol1;
		this.date= date1;
				
	}
	
	public String getHtmlDescription(){
		SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM/yyyy");
	    String DateToStr = datePattern.format(getDate());
			
	   return ("<b>Stock symbol</b> : " + getSymbol() +
			   " <b>Ask</b> : " + getAsk() + 
			   " <b>Bid</b> : " + getBid() +
			   " <b>Date</b> : "+ DateToStr);
	
	}
			
}

