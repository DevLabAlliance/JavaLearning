package com.dla;
/*
       5
      4 5
     3 4 5
    2 3 4 5
   1 2 3 4 5
  
      
 */
import java.util.Scanner;


/**
 * @author Devlabs Alliance
 *
 */
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n=s.nextInt();
		pattern(n);
		s.close();

	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
