package com.xworkz.andriod;

public class Andriod {
	private String deviceName;
	private String model;
	private double price;
	private String storage;
	private String ramSize;
	public Andriod()
	{
		
	}
	public Andriod(String deviceName,String model,double price,String storage,String ramSize)
	{
		this.deviceName=deviceName;
		this.model=model;
		this.price=price;
		this.storage=storage;
		this.ramSize=ramSize;
	}
	public String getDeviceName()
	{
		return deviceName; 
	}
    public void setDeviceName(String deviceName)
    {
    	this.deviceName=deviceName;
    }
    public String getModel()
    {
    	return model; 
    }
    public void setModel(String model)
    {
    	this.model=model;
    }
    public double getPrice()
    {
    	return price;
    }
    public void setPrice(double price)
    {
    	this.price=price;
    }
    public String getStorage()
    {
    	return storage;
    }
    public void setStorage(String storage)
    {
    	this.storage=storage;
    }
    public String getRamSize()
    {
    	return ramSize; 
    }
    public void setRamSize(String ramSize)
    		{
    	       this.ramSize=ramSize;
    		}
}

