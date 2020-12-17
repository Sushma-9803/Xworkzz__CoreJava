package com.xworkz.xworkzapp.showroom;

public class ArtGallaryOperation {
	
	 public  MounmentsDTO[] mounmentsdtos;
	 
	 public int index;
	 
	 public ArtGallaryOperation(int size) {
	 mounmentsdtos=new MounmentsDTO[size];
	 }
	 
	 public void addMonumentsDetails(MounmentsDTO mounments)
	 {
		 System.out.println("adding mounments detail");
		 mounmentsdtos[index++]=mounments;
		 System.out.println("added all mounments detail");
	 }
	  public void showAllMounmentsDetails()
	  {
		  for(MounmentsDTO mounments:mounmentsdtos ) {
			 if(mounments !=null) {
				 System.out.println(mounments.getName()+" "+mounments.getYear());
			 }
			 else
			 {
				 System.out.println("plz add mounments details ");
			 }
		  }
	  }
	 
	 

}
