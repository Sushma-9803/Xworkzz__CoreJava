package com.xworkz.xworkzapp.cityward;

public class CityWardDTO {
     private int wardNo;
     private String wardName;
     private String corporator;
     private long population;
     private String areaInSqKiloMeters;
     
     public int getWardNo()
     {
    	 return wardNo;
     }
     public void setWardNo(int wardNo)
     {
    	 this.wardNo=wardNo;
     }
     public String getWardName()
     {
    	 return wardName; 
     }
     public void setWardName(String wardName)
     {
    	 this.wardName=wardName;
     }
	public String getCorporator() {
		return corporator;
	}
	public void setCorporator(String corporator) {
		this.corporator = corporator;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getAreaInSqKiloMeters() {
		return areaInSqKiloMeters;
	}
	public void setAreaInSqKiloMeters(String areaInSqKiloMeters) {
		this.areaInSqKiloMeters = areaInSqKiloMeters;
	}
     
}
