package com.xworkz;

import com.xworkz.transport.Transporation;

public class TransUtil {

	public static void main(String[] args) {
		
		
		 Transporation trans = new   Transporation ();
		 trans.id="LA2345JY";
		 trans.name="VRL Logistics";
		 trans.noOfBranches=4;
		
		 System.out.println(trans.id + " " + trans.name +" "+ trans.noOfBranches);
		 trans.importAndExport();
		 trans.transport();
		                                           // This is for each
		 for(int i=0; i<trans.address.length; i++) //for(String address : trans.address)
		 {                                         
			 System.out.println(trans.address[i]); // SOP(address)
		 }
		
	} 
}
