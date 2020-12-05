package com.xworkz.pizzaconst;

public class PizzaConst {

	public String address;
	public String typeOfPizzas;
	public double price;
	
	//zero paramater constructor
	public PizzaConst()
	{
	System.out.println("ending with zero paramaterizied constructor");
	}
	
	// one paramater constructor
		public PizzaConst(double price)
		{
			this.price=price;	
		}
	
	//two paramater consturctor
	public PizzaConst(String address, String typeOfPizzas)
	{	
		this.address=address;
		this.typeOfPizzas=typeOfPizzas;	
	}
	
}
