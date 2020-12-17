package com.xworkz.xworkzapp.farmdto.util;

import java.util.Scanner;

//import java.util.Scanner;

import com.xworkz.xworkzapp.farmdto.FarmDTO;
import com.xworkz.xworkzapp.farmdto.Operation;

public class FarmUtil {
	public static void main(String[] args) {
				FarmDTO f1=new FarmDTO("black","2acre","peanuts");
		FarmDTO f2=new FarmDTO("red","3acre","sunflower");
		
		Operation oper=new Operation(2);
		
		oper.addFarmDetails(f1);
		oper.addFarmDetails(f2);
	oper.showAllFarmDetails();
   /* Scanner sc=new Scanner(System.in);
	System.out.println("enter the farm size");
		int size =sc.nextInt();
	Operation oper=new Operation(size);
		for(int i=0; i<size; i++)
		{
			FarmDTO dto= new FarmDTO();
			System.out.println("enter the" +(i+1) + "farm details");
			System.out.println("enter the soil");
			String typeOfSoil=sc.next();
			System.out.println("enter the area");
			String area=sc.next();
			System.out.println("enter the crop");
			String typeOfcrop=sc.next();
			
			dto.setTypeOfSoil(typeOfSoil);
			dto.setArea(area);
			dto.setTypeOfCrop(typeOfcrop);
			oper.addFarmDetails(dto);
		}
		oper.showAllFarmDetails();
		sc.close();
	}

	*/		
	
	

	}
}
		
		
	


