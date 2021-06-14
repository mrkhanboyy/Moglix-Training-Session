package com.training.org;

public class Stock {


	private int stockid;
	private String stockCode;
	private String stockName;
	public Stock() {
		super();
	}
	public Stock(int stockid, String stockCode, String stockName) {
		super();
		this.stockid = stockid;
		this.stockCode = stockCode;
		this.stockName = stockName;
	}
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", stockCode=" + stockCode + ", stockName=" + stockName + "]";
	}
	
	
	
}
