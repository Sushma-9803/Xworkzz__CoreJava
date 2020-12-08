package com.xworkz.andriodutil;

import com.xworkz.andriod.Andriod;

public class AndriodUtil {
	public static void main(String[] args) {
		Andriod andriod=new Andriod("redmi","redmiy1",13750.00,"64.00GB","4.00GB");
		andriod.setDeviceName("redmi");
		andriod.setModel("redmiy1");
		andriod.setPrice(13750.00);
		andriod.setStorage("64.00GB");
		andriod.setRamSize("4.00GB");
		
		System.out.println(andriod.getDeviceName()+" "+andriod.getModel()+" "+andriod.getPrice()+" "+andriod.getStorage()+" "+andriod.getRamSize());
	}
	}


