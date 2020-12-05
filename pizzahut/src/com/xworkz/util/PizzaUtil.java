package com.xworkz.util;

import java.util.Scanner;

import com.xworkz.pizza.PizzaHut;

public class PizzaUtil {

	public static void main(String[] a)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the address");
		String address = sc.next();
		System.out.println("Enter the typeof pizza");
		String typeOfPizzas = sc.next();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		sc.close();
	PizzaHut pizzaHut = new PizzaHut(address,typeOfPizzas,price);
    System.out.println(pizzaHut.address);
    System.out.println(pizzaHut.typeOfPizzas);
    System.out.println(pizzaHut.price);
	} 
}
