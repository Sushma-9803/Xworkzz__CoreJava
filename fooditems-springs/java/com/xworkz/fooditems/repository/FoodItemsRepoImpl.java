package com.xworkz.fooditems.repository;

import com.xworkz.fooditems.entity.FoodItemsEntity;

public class FoodItemsRepoImpl implements FoodItemsRepo {

	public FoodItemsRepoImpl() {
		System.out.println("created FoodItemRepoImpl");
	}

	@Override
	public void save(FoodItemsEntity entity) {
		System.out.println("invoked save method" +entity);

		
	}
}