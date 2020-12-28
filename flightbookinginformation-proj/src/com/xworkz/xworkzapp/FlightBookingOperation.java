package com.xworkz.xworkzapp;

public class FlightBookingOperation {
	
	public  FlightBookingDTO[] flightbook=new FlightBookingDTO[2];
	public int index;
	
	public void addflightBooking(FlightBookingDTO flightbook) {
		
			if(flightbook.getAirplaneCode() !=null || flightbook.getCompany() != null || flightbook.getBusinessClassPrice() >=1000 
					|| flightbook.getStartingPoint() !=null ) {
				      this.flightbook[index++]=flightbook;
						System.out.println("adding details of flightbooking=" + flightbook.getCompany());
						}
						else {
							System.out.println("booking is not avialble");
						}
					}
				
			public void searchFlightBookingByStartingPoint(String startingPoint) {
			boolean point=false;
			System.out.println("searching the starting point=" +startingPoint); 
			
			for (int i = 0; i < flightbook.length; i++) {
			if(flightbook != null) {
				if(flightbook[i].getStartingPoint().equals(startingPoint)) {
					point = true;
				System.out.println(flightbook[i].getAirplaneCode()+" "+flightbook[i].getCompany()+" "+flightbook[i].getBusinessClassPrice()
						+" "+flightbook[i].getStartingPoint()+" "+flightbook[i].getEndingPoint());	
			 }
				else {
					point =false;
				}
				
			}
			if(point==true) {
				System.out.println("Flight are avsailabble");
			}
			else {
				System.out.println("Flight is not there at this point");
			}
		}
			
			
}
		
	public void displayAllFlightBooking() {
		
		for (int i = 0; i < flightbook.length; i++) {
			if(flightbook != null) {
				System.out.println("airplanecode- "+flightbook[i].getAirplaneCode()+" company-"+flightbook[i].getCompany()+" businessclassprice-"+flightbook[i].getBusinessClassPrice()
						+" starting point-"+flightbook[i].getStartingPoint()+" endingpoint-"+flightbook[i].getEndingPoint());
			}
		}
	}
}
	
			


