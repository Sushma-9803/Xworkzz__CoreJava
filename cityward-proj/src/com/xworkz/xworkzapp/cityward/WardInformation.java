package com.xworkz.xworkzapp.cityward;

public class WardInformation {
	public CityWardDTO[] cityward=new CityWardDTO[2];
	public int index;
	
	public WardInformation()
	{
		System.out.println("WardInformation object is created");
	}
    
	public void addWardDetails(CityWardDTO cityward )
	{
		//System.out.println("adding car details");
	
	   if(cityward!=null)
	   {
		 this.cityward[index++]=cityward;  
	   }
		  
	   else if(cityward==null) {
		   System.out.println("cityward details are not added");
	   }
   }
	
	public void acceptAllWardDeatils(int wardno,String wardName,long population) {
		   for (int i = 0; i < cityward.length; i++) {
			   if(cityward != null) {
				   if(cityward[i].getWardNo()==wardno) {
					   
					   if(cityward[i].getWardName()==wardName) { 
						  
						   if(cityward[i].getPopulation()==population) {
							   System.out.println(cityward[i].getWardNo()+""+cityward[i].getWardName()+" "+cityward[i].getCorporator()+" "+cityward[i].getPopulation()+
				      					" "+cityward[i].getAreaInSqKiloMeters());
							   
							   
							   }
						   }
					   }
				   }
			   }
			
		}

         public void displayWardDetails()
      {
      	for(int i=0; i<cityward.length;i++)   
      	
      		if(cityward != null) {
      			System.out.println(cityward[i].getWardNo()+" "+cityward[i].getWardName()+" "+cityward[i].getCorporator()+" "+cityward[i].getPopulation()+
      					" "+cityward[i].getAreaInSqKiloMeters());
      		
      }
   }
   public void searchCityWardByName(String name) {
	   for (int i = 0; i < cityward.length; i++) {
		   if(cityward !=null) {
			   if(cityward[i].getWardName().equals(name)){
				   System.out.println(cityward[i].getWardNo()+""+cityward[i].getWardName()+" "+cityward[i].getCorporator()+" "+cityward[i].getPopulation()+
      					" "+cityward[i].getAreaInSqKiloMeters());
			   }  	   else {
				   System.out.println("not added");
			   }
		   }
		
	}
   }
   public void returnCorporatorByWardNo(int wardNo) {
	   for (int i = 0; i < cityward.length; i++) {
		   if(cityward !=null) {
			   if(cityward[i].getWardNo()==wardNo) {
				   System.out.println(cityward[i].getCorporator());
			   }
		   }
		
	  }
  }
}