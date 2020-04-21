package com.dla;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		System.out.println("Enter the matrix ");
		Scanner s =new Scanner(System.in);
		int mat[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		System.out.println(" the original matrix is ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
		transpose(mat);
	}
		public static void transpose(int [][]matrix)
		{
			System.out.println(" The tranposed matrix is ");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(matrix[j][i]+" ");
				}
				System.out.println();
			}	
			
		}
		
	

}
