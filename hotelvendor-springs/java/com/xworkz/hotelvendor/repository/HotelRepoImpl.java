package com.xworkz.hotelvendor.repository;

import com.xworkz.hotelvendor.entity.HotelVendorEntity;

public class HotelRepoImpl implements HotelRepo {

	public HotelRepoImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save" + entity);

	}
}
