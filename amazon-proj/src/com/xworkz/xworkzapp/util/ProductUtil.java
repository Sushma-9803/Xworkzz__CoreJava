package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.ProductDTO;
import com.xworkz.xworkzapp.ProductsDTO;


public class ProductUtil {
	public static void main(String[] args) {
		
/*		AmazonDTO a1= new AmazonDTO("braclet","1234",599.00);
		AmazonDTO a2=new AmazonDTO("pendent","3245",499.00);
		
		ProductsDTO a=new ProductsDTO(2);
		a.addProductDetails(a1);
		a.addProductDetails(a2);
		a.showAllProductDetails();
		
		
	}*/
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the products");
		int size =sc.nextInt();
		ProductsDTO a=new ProductsDTO(size);
		for(int i=0; i<size; i++)
		{
			ProductDTO dto= new ProductDTO();
			System.out.println("enter the" +(i+1) + "product details");
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the id");
			String id=sc.next();
			System.out.println("enter the price");
			double price=sc.nextDouble();
			
			dto.setName(name);
			dto.setId(id);
			dto.setPrice(price);
			a.addProductDetails(dto);
		}
		a.showAllProductDetails();
		sc.close();
	}



}
