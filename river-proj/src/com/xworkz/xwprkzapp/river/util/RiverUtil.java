package com.xworkz.xwprkzapp.river.util;

import com.xworkz.xwprkzapp.river.Ganga;
import com.xworkz.xwprkzapp.river.Kavari;
import com.xworkz.xwprkzapp.river.Yamuna;

public class RiverUtil {
	public static void main(String[] args) {
		
	
	Ganga ganga =new Ganga();
	ganga.setBirthPlace("Gangotri");
	ganga.setType("long");
	ganga.setEndPlace("Bay Of Bengal");
	System.out.println(ganga.getBirthPlace()+" "+ganga.getType()+" "+ganga.getEndPlace());
	
  Yamuna y=new Yamuna();
  y.setBirthPlace("yamountri");
  y.setType("long");
  y.setEndPlace("Bay Of Bengal");
  System.out.println(y.getBirthPlace()+" "+y.getType()+" "+y.getEndPlace());
  
   Kavari k=new Kavari();
   k.setBirthPlace("Tala Kavreri");
   k.setType("long");
   k.setEndPlace("Bay Of Bengal");
   System.out.println(k.getBirthPlace()+" "+k.getType()+" "+k.getEndPlace());
	}
}
   
   
	

