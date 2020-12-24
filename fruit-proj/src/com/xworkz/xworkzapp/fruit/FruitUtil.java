package com.xworkz.xworkzapp.fruit;

public class FruitUtil {
	public static void main(String[] args) {
		
		 Dragon f=new  Dragon();
		f.color="pink";
		f.price=45.00;
		f.makeHappy();
		System.out.println(f.color+" "+f.price);
		
		Fruit fruit=new Dragon(); //upcasting
		fruit.color="black";
		fruit.price=99.00;
		fruit.makeHappy();
		System.out.println(fruit.color+" "+fruit.price);
		
	}

}
