/*
 * WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”
i. Harsh is not palindrome
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class PalimdromeString {

	void checkPalindrome(String str)
	{
		String rev="";
		for(int j=str.length()-1; j>=0;j--)
			{
				rev=rev+str.charAt(j);
			}
		System.out.println("Reverse is :" + rev);
		if(str.equalsIgnoreCase(rev))
			System.out.println("String is Palindrome!!");
		else
			System.out.println("String is not Palindrome!!");
	}
		
	public static void main(String[] args) {
		PalimdromeString obj1 = new PalimdromeString();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.next();
		obj1.checkPalindrome(str);
		scan.close();
	}
}
