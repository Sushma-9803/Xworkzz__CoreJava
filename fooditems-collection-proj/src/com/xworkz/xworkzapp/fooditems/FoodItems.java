package com.xworkz.xworkzapp.fooditems;

import java.util.ArrayList;
import java.util.Collection;

public class FoodItems {
	
	public static void main(String[] args) {
		
		String idli="tatte idli";
		String chicken="butter chicken";
		String juice="muskmelon";
		String icecream="chocalate";
		String chips="patato";
		
		Collection<String> fooditems=new ArrayList();
		fooditems.add(idli);
		fooditems.add(chicken);
		fooditems.add(juice);
		fooditems.add(icecream);
		fooditems.add(chips);
		System.out.println(fooditems);
		System.out.println(fooditems.size());
		
		boolean present =fooditems.contains(icecream);
		System.out.println("food items is present:"+present);
	}

}
