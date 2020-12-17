package com.xworkz.xworkzapp.showroom.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.showroom.ArtGallaryOperation;
import com.xworkz.xworkzapp.showroom.MounmentsDTO;

public class MounmentsUtil {
	 public static void main(String[] args) {
		 
	/*	 MounmentsDTO mn1=new MounmentsDTO("charminar", 1591);
		 MounmentsDTO mn2=new MounmentsDTO("Gate Way Of India", 1994) ;
		 
		 ArtGallaryOperation art=new ArtGallaryOperation(3);
		 art.addMonumentsDetails(mn1);
		 art.addMonumentsDetails(mn2);
		 art.showAllMounmentsDetails();
		/* 
		 * }
		 */
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the mounment size");
		 int size=sc.nextInt();
		 ArtGallaryOperation art=new ArtGallaryOperation(size);
		 for(int i=0; i<size; i++)
		 {
			 MounmentsDTO dto =new MounmentsDTO();
			 System.out.println("enter the  farm + details");
			 System.out.println("enter the name");
			 String name=sc.next();
			 System.out.println("enter the year");
			 int year=sc.nextInt();
			 
			 dto.setName(name);
			 dto.setYear(year);
			 art.addMonumentsDetails(dto);
		 }
		  art.showAllMounmentsDetails();
		  sc.close();
			 }
			 
		}


