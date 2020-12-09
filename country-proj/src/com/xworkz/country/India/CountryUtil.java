package com.xworkz.country.India;

import com.xworkz.country.Country;

public class CountryUtil {
	public static void main(String[] args) {
		
	Country country=new Country();
	country.noOfStates=29;
	country.noOfLanguages=12;
	country.capital="Delhi";
	System.out.println(country.noOfStates+" "+country.noOfLanguages
                          +" "+	country.capital);
			
	}

}
