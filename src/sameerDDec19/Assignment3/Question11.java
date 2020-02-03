package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find to number is palindrome or not.
	Note:- Palindrome means given word/number is same to read from forward and backward
	i.e. actual number :- 12321
	reverse of actual number :- 12321
 */
public class Question11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		int number=sc.nextInt();
		String str=Integer.toString(number);
		palindrome(str);
	}
	static void palindrome(String str)
	{
			String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			str1=str1+c;
		}
		System.out.println(str1);
		if(str1.equals(str))
		{
			System.out.println("The string is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}	
	}
}
