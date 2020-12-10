package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
import com.xworkz.xworkzapp.icecream.Chocalate;

public class IceCreamUtil {
	
	public static void main(String[] args) {
		ButterScotch bs=new ButterScotch();
		bs.setCost(45.00);
		bs.setType("cone");
		System.out.println(bs.getCost()+" "+bs.getType());
		
		
		Chocalate choco= new Chocalate();
		choco.setCost(50.00);
		choco.setType("cup");
		System.out.println(choco.getCost()+" "+choco.getType());
		
	}
	

}
