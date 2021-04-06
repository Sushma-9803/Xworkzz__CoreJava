package com.xworkz.hotelvendor.service;

import com.xworkz.hotelvendor.entity.HotelVendorEntity;
import com.xworkz.hotelvendor.repository.HotelRepo;

public class HotelVendorServiceImpl implements HotelVendorService {
	private HotelRepo repository;

	public HotelVendorServiceImpl(HotelRepo repository) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}

	@Override
	public boolean ValidAndSave(HotelVendorEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}

		return false;
	}

}
