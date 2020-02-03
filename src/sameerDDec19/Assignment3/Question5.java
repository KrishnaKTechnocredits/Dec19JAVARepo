package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to reveres user given number
	a. Input number:- 456789
	b. Output number :- 987654
 */
public class Question5
{
	static int rev=0;
	static int reminder=0;
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number=sc.nextInt();
		reverse(number);
		System.out.println("The reverce number is :"+rev);
	}
	static void reverse(int number)
	{
		
		System.out.println("The given Number is :"+number);
		while(number!=0)
		{
			reminder=number%10;
			rev=(rev*10)+reminder;
			number=number/10;
		}
		
	}
	

}
