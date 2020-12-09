package com.sushma.sushapp;

public class Tablet {
	
	private String tabName;
	private double price;
	private int noOfTab;
	public Tablet(String tabName,double price,int noOfTab)
	{
		this.tabName=tabName;
		this.price=price;
		this.noOfTab=noOfTab;
	}
	public String getTabName() {
		return tabName;
	}
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoOfTab() {
		return noOfTab;
	}
	public void setNoOfTab(int noOfTab) {
		this.noOfTab = noOfTab;
	}
	
	

}
