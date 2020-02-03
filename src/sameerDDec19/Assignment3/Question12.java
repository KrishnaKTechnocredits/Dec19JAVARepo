package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find word is palindrome or not ?
	a. String name = “naman”
	i. Naman is palindrome
	b. String name = “harsh”
	i. Harsh is not palindrome 	
 */
public class Question12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		palindromeCheck(str);
		
		System.out.println("Enter the second String :");
		String str2=sc.nextLine();
		palindromeCheck(str2);
	}
	static void palindromeCheck(String str)
	{
		String strNew="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			strNew=strNew+ ch;
		}
		if(strNew.equals(str))
		{
			System.out.println("String is Palindrome ");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
