package com.xworkz.xworkzapp.watch;

import java.util.Date;

public class WatchUtil  {
	  public static void main(String[] args) {
	//	  Date date=new Date();
		
		//  Rolex rolex=new Rolex();
		  // rolex.modelNo="rt420";
		  // rolex.price=5555.99;
		  // rolex.displayTime();
		//  System.out.println(rolex.modelNo+" "+ rolex.price);
		  
		  
		  Watch watch=new Rolex();   //concept called upcasting parent refence  by child object 
		//  Rolex rolex=new Watch();  //down cating. we cannot do directly down cating
		  Rolex rolex=(Rolex)watch;// we do up casting then we  do down casting,(child reference by parent object)
		  watch.modelNo="rt420";
		  watch.price=5555.99;
		  rolex.displayTime();
		 // rolex.time();
		  System.out.println(watch.modelNo+" "+ watch.price);
		 
		  
		
		  
	}

}
 
