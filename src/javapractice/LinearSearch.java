package javapractice;

public class LinearSearch {
	public static int lin(int key,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)//comparing the key
			{
				return i;
			}
			
		}
		return -1;
	}
	public static int binary(int key,int low,int high,int arr[])   //for binary search the array should be in sorted order
	{    if(low>high)		
		return -1;

		int mid=(high+low)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]<key)   ///key is in right half
		{
			return(binary(key,mid+1,high,arr));
		}
		else if (arr[mid]>key)  //key is in left half
		{
			return(binary(key,low,mid-1,arr));
		}
		else
			return -1;
//		
	}
	
public static void main(String[] args)
{
	int array[]= {1,2,5,-6,8};// initializing the array
	System.out.println(lin(9,array));
	int a[]= {1,43,65,78,90,93,97};
	System.out.println(binary(7,0,6,a));
}
}
