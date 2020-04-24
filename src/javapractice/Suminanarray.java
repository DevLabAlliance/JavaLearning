package javapractice;
import java.util.*;
public class Suminanarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]arr=new int[10];
		int sum=0;
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		s.close();
		System.out.println("Sum of array elements is "+sum);
	}

}
