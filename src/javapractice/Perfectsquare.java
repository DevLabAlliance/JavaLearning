package javapractice;
import java.util.*;
//to check whether the number is a perfect square
public class Perfectsquare {
	public  static boolean checkperfect(double n)
	{
		double dla=Math.sqrt(n);
	//	return ((dla-Math.floor(n))==0);//5-25  (this is wrong)
		return dla-Math.floor(dla)==0;  //5-5=0
		
	}
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the input number "); 
		
		
		
		double h=s.nextDouble();
		if(checkperfect(h)==true)
		{
			System.out.println("The number is a perfect square ");
		}
		else
		{
System.out.println("The number is not a perfect square ");
		}
		s.close();	
	}
	
	
	

}