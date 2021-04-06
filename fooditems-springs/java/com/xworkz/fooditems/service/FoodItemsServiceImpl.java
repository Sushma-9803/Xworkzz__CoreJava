package com.xworkz.fooditems.service;

import com.xworkz.fooditems.entity.FoodItemsEntity;
import com.xworkz.fooditems.repository.FoodItemsRepo;

public class FoodItemsServiceImpl implements FoodItemsService{

	private FoodItemsRepo repository;
	
	public FoodItemsServiceImpl(FoodItemsRepo repository ) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}
	
	@Override
	public boolean ValidateAndSave(FoodItemsEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			this.repository.save(entity);
			System.out.println("entity is valid");
			
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
