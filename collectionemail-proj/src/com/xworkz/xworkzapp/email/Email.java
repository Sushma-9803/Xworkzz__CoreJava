package com.xworkz.xworkzapp.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Email {
	public static void main(String[] args) {
		
		String emailid1="apsushma98@gmail.com";
		String emailid2="apsushma96@gmail.com";
		String emailid3="apsushmaece.rymec@gmail.com";
		String emailid4="apsushmaxworkz@gmail.com";
		String emailid5="chennaindupriya@gmail.com";
		String emailid6="bharathap96@gmail.com";
		String emailid7="harishap98@gmail.com";
		String emailid8="apsuma@gmail.com";
		String emailid9="apnagaraj@gmail.com";
		String emailid10="xworkzodc01@gmail.com";
		
		String emailid11="divyabusa@gmail.com";
		String emailid12="meghana98@gmail.com";
		String emailid13="sindu@gmail.com";
		String emailid14="siri@gmail.com";
		String emailid15="aishu@gmail.com";
		String emailid16="parthu@gmail.com";
		String emailid17="choti98@gmail.com";
		String emailid18="monisha98@gmail.com"; 
		String emailid19="spoorti@gmail.com";
		String emailid20="naina@gmail.com";
		
		Collection<String> email=new ArrayList();
		email.add(emailid1);
		email.add(emailid2);
		email.add(emailid3);
		email.add(emailid4);
		email.add(emailid5);
		email.add(emailid6);
		email.add(emailid7);
		email.add(emailid8);
		email.add(emailid9);
		email.add(emailid10);
		
		email.add(emailid11);
		email.add(emailid12);
		email.add(emailid13);
		email.add(emailid14);
		email.add(emailid15);
		email.add(emailid16);
		email.add(emailid17);
		email.add(emailid18);
		email.add(emailid19);
		email.add(emailid20);
  System.out.println("list of main id"+ email);
  
  int totalElements=email.size();
  System.out.println("totalElements:"+totalElements);
  
  Iterator<String> iterator=email.iterator();
  while (iterator.hasNext()) {
	String emails = iterator.next();
	if (emails.equals("apsushma98@gmail.com")) {
		iterator.remove();
	}
	 }
	System.out.println(email.size());
}
}


