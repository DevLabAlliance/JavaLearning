package javapractice;
import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class SumandAverage {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the elements for summation");
		for(int i=0;i<n;i++) {
			int num=s.nextInt();
			
			sum=sum+num;
		}
		int avg=sum/n;
		s.close();
	System.out.println("The sum and average of the numbers are"+sum+"  "+avg);
	}

}
