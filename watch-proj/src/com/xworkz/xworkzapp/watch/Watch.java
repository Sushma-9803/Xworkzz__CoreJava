package com.xworkz.xworkzapp.watch;

import java.util.Date;

public class Watch {
	public Watch()
	{
		System.out.println("watch object ic created");
	}
	
	
	public String modelNo;
	public double price;
	
	 public  void displayTime()
	   {
	    Date date=new Date();
		    System.out.println(date);
	   }

	

}
