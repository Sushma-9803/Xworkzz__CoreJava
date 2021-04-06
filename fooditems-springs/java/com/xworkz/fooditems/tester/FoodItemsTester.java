package com.xworkz.fooditems.tester;

import com.xworkz.fooditems.constansts.FoodType;
import com.xworkz.fooditems.entity.FoodItemsEntity;
import com.xworkz.fooditems.repository.FoodItemsRepo;
import com.xworkz.fooditems.repository.FoodItemsRepoImpl;
import com.xworkz.fooditems.service.FoodItemsService;
import com.xworkz.fooditems.service.FoodItemsServiceImpl;

public class FoodItemsTester {
	public static void main(String[] args) {
		
			
			FoodItemsEntity entity = new FoodItemsEntity("Veg-Biriyani", 120, FoodType.SOUTHINDIAN, "Good" );
			
			FoodItemsRepo repository = new FoodItemsRepoImpl();
			FoodItemsService service = new FoodItemsServiceImpl(repository);
			boolean save = service.ValidateAndSave(entity);
			System.out.println(save);
			
		}
	}


