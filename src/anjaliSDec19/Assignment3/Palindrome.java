/*
 * WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
reverse of actual number :- 12321
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class Palindrome {

	int checkPalindrome(int num)
	{
		int rev=0;
		while(num>0)
		{	
			rev=rev*10;
			rev=rev +(num%10);
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Palindrome obj1 = new Palindrome();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int rev=obj1.checkPalindrome(num);
		System.out.println("Reverse is :"+ rev);
		if(num == rev)
			System.out.println("Number is Palindrome!!");
		else
			System.out.println("Number is not Palindrome!!");
		scan.close();
	}
}
