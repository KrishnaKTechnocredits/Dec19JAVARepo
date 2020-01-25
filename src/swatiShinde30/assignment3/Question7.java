package swatiShinde30.assignment3;
/*
 * WAP to find Factorial series for user defined number
 */
import java.util.Scanner;

public class Question7 
{
	static int fact = 1;

	static void factorial(int num)
	{// int fact = 0;

		for (int i = 1; i <= num; i++) 
		{
			fact = fact * i;

		}

	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
		factorial(num);
		System.out.println(fact);
	}

}
