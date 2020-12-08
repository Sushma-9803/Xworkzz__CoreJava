package com.xworkz.ironbox;

public class IronBox {
public int price;
public	String company;
	public String typeOfPlates;
	public IronBox()
	
	{
		System.out.println("steel");
		System.out.println("iron");
	}
	
public IronBox(int price,String company,String typeOfPlates)
	{
		 this.price=price;
		 this.company=company;
		 this.typeOfPlates=typeOfPlates;
	}

public int getPrice()
{
	return price;
}

   public void setPrice(int price)
   {
	   this.price=price;
   }
   
   public String getcompany()
   {
	   return company;
   }
   
   public void setcompany(String company)
   {
	   this.company=company;
   }
   
   public String getTypeOfPlates()
   {
	   return typeOfPlates;
   }
   
   public void setTypeOfPlates(String TypeOfPlates)
   {
	   this.typeOfPlates=TypeOfPlates;
   }
}
