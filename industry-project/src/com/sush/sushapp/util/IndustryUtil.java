package com.sush.sushapp.util;

import com.sush.sushapp.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		
		SteelIndustry industry=new SteelIndustry();
		industry.setArea("hsr layout");
		industry.setNoOfWorkers(99);
         industry.setType("manufacture");		
		System.out.println(industry.getType()+" "+ industry.getNoOfWorkers()+" "+ industry.getArea());
	}

}
