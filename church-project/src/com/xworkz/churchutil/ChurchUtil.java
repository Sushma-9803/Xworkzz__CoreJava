package com.xworkz.churchutil;

import com.xworkz.church.Church;

public class ChurchUtil {
	public static void main(String[] args) {
		Church church= new Church("st mary church","goa",5);
		church.setName("st mary church");
		church.setAddress("goa");
		church.setnoOfFathers(5);
		System.out.println(church.getName()+" "+church.getAddress()+" "+church.getnoOfFathers());
	}

}
