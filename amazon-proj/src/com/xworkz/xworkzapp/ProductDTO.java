package com.xworkz.xworkzapp;

public class ProductDTO {
	
	private String name;
	private String id;
	private double price;
	
/*	public  AmazonDTO (String name,String id,double price)
	{
		super();
		this.name=name;
		this.id=id;
		this.price=price;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
