package com.xworkz.xworkzapp;

public class FlightBookingInformationUtil {
	public static void main(String[] args) {
		
		FlightBookingOperation fo=new FlightBookingOperation();
		
		FlightBookingDTO fb=new FlightBookingDTO();
		
		fb.setAirplaneCode("12abc");
		fb.setCompany("ingigo");
		fb.setDomestic(true);
		fb.setEconomyClassPrice(109099.000);
		fb.setBusinessClassPrice(30000);
		fb.setStartingPoint("mumbai");
		fb.setEndingPoint("banglore");
		
		FlightBookingDTO fb1=new FlightBookingDTO();
		fb1.setAirplaneCode("456xyz");
		fb1.setCompany("Air India");
		fb1.setDomestic(false);
		fb1.setEconomyClassPrice(20.000);
		fb1.setBusinessClassPrice(500000);
		fb1.setStartingPoint("maldvies");
		fb1.setEndingPoint("hyd");	
		
		fo.addflightBooking(fb);
		fo.addflightBooking(fb1);
		fo.displayAllFlightBooking();
		
		fo.searchFlightBookingByStartingPoint("mumbai");
		
	}

}
