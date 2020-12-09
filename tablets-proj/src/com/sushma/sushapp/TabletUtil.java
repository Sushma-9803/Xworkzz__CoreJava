package com.sushma.sushapp;

public class TabletUtil {
	public static void main(String[] args) {
		
		Sinarest s=new Sinarest("zerodol",99.00,10);
//		s.setTabName("zerodol");
//		s.setPrice(99.00);
//        s.setNoOfTab(10);
        System.out.println(s.getTabName()+" "+s.getPrice()+" "+ s.getNoOfTab());
	}

}
