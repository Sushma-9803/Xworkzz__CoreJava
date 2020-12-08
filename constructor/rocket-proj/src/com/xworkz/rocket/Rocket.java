package com.xworkz.rocket;

import java.util.Date;

public class Rocket {
	
	private String name;
	public int id;
	public Date date;
	
	public Rocket()
	{
		System.out.println("created");
	}
public Rocket(String name, int id)
{
  this.name=name;
  this.id=id;
  
}
 public String getName() {
 return name;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
   public int getId()
   {
	   return id;
   }
   public void setId(int id)
   {
	   this.id=id;
   }
   public Date getDate() {
	   return date;
   }
   public void setDate(Date date)
   {
	   this.date=date;
   }
 }

