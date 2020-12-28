package com.xworkz.xworkzapp.cityward;

public class CityWardDTOUtil {
	public static void main(String[] args) {
		
		WardInformation wardinfo=new WardInformation();
		CityWardDTO cw=new CityWardDTO();
		cw.setWardNo(201);
		cw.setWardName("Green palace");
		cw.setCorporator("rohan");
		cw.setPopulation(45789l);
		cw.setAreaInSqKiloMeters("25");
		
		
		CityWardDTO cw1=new CityWardDTO();
		cw1.setWardNo(202);
		cw1.setWardName("rock garden");
		cw1.setCorporator("sush");
		cw1.setPopulation(78989l);
		cw1.setAreaInSqKiloMeters("78");
		
		
		wardinfo.addWardDetails(cw);
		wardinfo.addWardDetails(cw1);
		wardinfo.displayWardDetails(); 
		wardinfo.searchCityWardByName("rock garden");
		wardinfo.returnCorporatorByWardNo(202);
		wardinfo.returnCorporatorByWardNo(201);
		wardinfo.acceptAllWardDeatils(202 ,"rock garden", 78989l);
	}

}
