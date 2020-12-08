package com.xworkz.ironboxutil;

import com.xworkz.ironbox.IronBox;

public class IronBoxUtil {
	public static void main(String[] args) {
		IronBox ironbox=new IronBox(500,"philps","iron or steel");
		System.out.println(ironbox.price+" "+ironbox.company+" "+ironbox.typeOfPlates);
	}

}
