package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class Cubeofanumber {
 public static void main(String ar[]) {
		 
		 Cubeofanumber.cube(8); 
		 
		 
	 }
	
	/**
	 * @param num
	 */
	public static void cube(int num)
	{  
	for(int i=1;i<=num;i++)
	{
		 System.out.println("The cube of a given number "+i+"is "+i*i*i);
	}
	
		
	}

	
}
