package com.dla;

public class Leapyear {
	public static void leapyr(int n) {
		if(n%4==0) {
			System.out.println("The year is a leap year");
		}
		else if(n%100==0) {
			System.out.println("The year is not a leap year");
			
		}
		else if (n%400==0) {
			System.out.println("The year is a leap year");
			
		}
		else
		{
			System.out.println("The year is  not a leap year");	
		}
	}
	public static void main(String args[]) {
		Leapyear.leapyr(2006);
		Leapyear.leapyr(2016);
	}

}
