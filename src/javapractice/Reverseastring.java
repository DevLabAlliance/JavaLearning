package javapractice;
//Reverse a string using recursion
public class Reverseastring {
	//method for reversing a string
	public static String reverse(String str)
	{
		if(str==null||str.length()<=1)
		{
			return str;
		}
		return(reverse(str.substring(1))+str.charAt(0));
	}
	public static void main(String[] args)
	{
		String s="Hello";
		System.out.println(Reverseastring.reverse(s));  
	}
}
