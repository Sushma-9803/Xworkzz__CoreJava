package com.xworkz.xworkzapp.mobileno;

import java.util.ArrayList;
import java.util.Collection;

public class MobileNo {
	
	public static void main(String[] args) {
		
		long mobileNo1=1234567891l;
		long mobileNo2=7975055169l;
		long mobileNo3=9701588954l;
		long mobileNo4=8106153020l;
		long mobileNo5=7204388904l;
		long mobileNo6=7022642509l;
		long mobileNo7=9701588954l;
		long mobileNo8=7685947484l;
		long mobileNo9=9857496124l;
		long mobileNo10=7654879123l;
		
		Collection<Long> mobileNo=new ArrayList();
		mobileNo.add(mobileNo1);
		mobileNo.add(mobileNo2);
		mobileNo.add(mobileNo3);
		mobileNo.add(mobileNo4);
		mobileNo.add(mobileNo5);
		mobileNo.add(mobileNo6);
		mobileNo.add(mobileNo7);
		mobileNo.add(mobileNo8);
		mobileNo.add(mobileNo9);
		mobileNo.add(mobileNo10);
	//	System.out.println(mobileNo);
		System.out.println("mobile numbers:"+mobileNo);
		System.out.println("no of mobile numbers:"+mobileNo.size());
		
		for(Long mobileNumber:mobileNo) {
			String convertedMobileNumber=mobileNumber.toString();
			Character last=convertedMobileNumber.charAt(convertedMobileNumber.length()-1);
			System.out.println(last);
			if(Integer.parseInt(last.toString()) > 3) {
				System.out.println("mobile no is greater"+ convertedMobileNumber);
			}
		}
		}
	}
