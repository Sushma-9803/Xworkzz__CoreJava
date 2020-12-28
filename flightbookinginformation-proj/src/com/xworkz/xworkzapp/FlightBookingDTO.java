package com.xworkz.xworkzapp;

public class FlightBookingDTO {

	 private String airplaneCode;
	 
	 private String startingPoint;
	 
	 private String endingPoint;
	 private String company;
	 private boolean domestic;
	 private double businessClassPrice;
	 private double EconomyClassPrice;
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public boolean isDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return EconomyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		EconomyClassPrice = economyClassPrice;
	}
	 
	 
	 
	 
	 
}
