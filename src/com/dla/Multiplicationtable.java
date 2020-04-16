package com.dla;

public class Multiplicationtable {
	public  static void mult(int n)
	{   System.out.println("Multiplication table of the number "+n+"is");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
	public static void main(String args[]) {
		Multiplicationtable.mult(6);
	}
}
