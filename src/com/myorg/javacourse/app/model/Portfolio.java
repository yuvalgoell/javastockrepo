package com.myorg.javacourse.app.model;

import com.myorg.javacourse.Stock;

public class Portfolio {
	final int MAX_PORTFOLIO_SIZE = 5;
	private String title ;
	private Stock[] stocks;
	private int portFolioSize=0;
	
	public Portfolio()
	{
		title = "Portfolio";	//didn't say what to set on exercise instructions
		stocks =new Stock[MAX_PORTFOLIO_SIZE];
	}
	
	public void addStock(Stock stock){
		if(portFolioSize < 0 || portFolioSize >= MAX_PORTFOLIO_SIZE)
			return;
		
		stocks[portFolioSize] = stock;
		portFolioSize++;
	}
	
	public Stock[] getStocks(){
		return stocks;
	}
	
	public String getHtmlString(){
		String html = "<h1>" + title + "</h1>";
		final String newLine = "<br />";
		
		for(int i = 0; i < MAX_PORTFOLIO_SIZE; i++ )
		{
			Stock tempStock = stocks[i];
			if(tempStock != null)
				html += newLine + tempStock.getHtmlDescription();
		}
		return html;
	}
	
	
}
