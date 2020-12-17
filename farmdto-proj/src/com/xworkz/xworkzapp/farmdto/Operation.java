package com.xworkz.xworkzapp.farmdto;

public class Operation {
	
	public FarmDTO[] farmDTOs;
	
	public int index;
	
	public  Operation(int size)
	{
		farmDTOs=new FarmDTO[size];
	}
	public void addFarmDetails(FarmDTO farm)
	{
		System.out.println("adding farm details");
		farmDTOs[index++]=farm;
		System.out.println("added all farm details");
		
	}
	public void showAllFarmDetails() {
		for(FarmDTO farmDTO:farmDTOs)
		{
			
			if(farmDTO != null) {
				System.out.println(farmDTO.getTypeOfSoil()+" "+farmDTO.getArea()+" "+farmDTO.getTypeOfCrop());
			}
			else {
				System.out.println("plz add farm details");
			}
			}
		}
	
	
	

}
