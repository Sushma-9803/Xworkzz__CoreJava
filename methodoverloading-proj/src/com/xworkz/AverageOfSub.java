package com.xworkz;

public class AverageOfSub {
	public static void main(String a[])
	{
	 avg(66.5,78.8,99.7);
	 avg(66.5,78.8);
	 }
	 static void avg(double firstsubject, double secondsubject,double thirdsubject)
	 {
	   double total = (firstsubject+secondsubject+thirdsubject)/3;
	   System.out.println(total);
	  }

	static void avg(double firstsubject, double secondsubject)
	 {
	   double total = (firstsubject+secondsubject)/2;
	   System.out.println(total);
	  }

}
