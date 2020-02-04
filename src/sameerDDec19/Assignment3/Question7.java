package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find Factorial series for user defined number
	a. Input number :- 5
	b. Output :- 120 
 */
public class Question7
{
	static int factorial=1;
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
		int number=sc.nextInt();
		factorial(number);
		System.out.println(factorial);
	}
	static void factorial(int number)
	{
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		
	}
}
