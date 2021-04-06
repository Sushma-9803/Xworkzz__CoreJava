package com.xworkz.hotelvendor.tester;

import com.xworkz.hotelvendor.constants.HotelType;
import com.xworkz.hotelvendor.entity.HotelVendorEntity;
import com.xworkz.hotelvendor.repository.HotelRepo;
import com.xworkz.hotelvendor.repository.HotelRepoImpl;
import com.xworkz.hotelvendor.service.HotelVendorService;
import com.xworkz.hotelvendor.service.HotelVendorServiceImpl;

public class HotelVendorTester {
	public static void main(String[] args) {
		HotelVendorEntity entity = new HotelVendorEntity("Nakshatra", "Ballari", 98765432, 6, HotelType.SUPPLIER);

		HotelVendorEntity entity1 = new HotelVendorEntity("Bageecha", "Ballari", 98765423, 8, HotelType.RETAILER);

		HotelRepo repository = new HotelRepoImpl();
		repository.save(entity);
		HotelVendorService vendorService = new HotelVendorServiceImpl(repository);
		vendorService.ValidAndSave(entity);

	}

}
