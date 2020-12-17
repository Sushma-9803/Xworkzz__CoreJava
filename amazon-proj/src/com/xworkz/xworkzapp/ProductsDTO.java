package com.xworkz.xworkzapp;


public class ProductsDTO {
	
	public int index;
	public ProductDTO[] productDTOs;
	
	public ProductsDTO(int size)
	{
		productDTOs=new ProductDTO[size];
	}
	public void addProductDetails(ProductDTO product)
	{
		System.out.println("adding product details");
		productDTOs[index++]=product;
		System.out.println("added all product details");
	}
	public void showAllProductDetails() {
	for(ProductDTO productDTOs:productDTOs)
	{
		if(productDTOs!=null) {
			System.out.println(productDTOs.getName()+" "+productDTOs.getId()+" "+productDTOs.getPrice());
			
		}
		else {
			System.out.println("plz add product details");
		}
			
	}
	
	

}
}
