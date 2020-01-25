package vishwasCDec19.assignment3;
/*
 * WAP to find Factorial series for user defined number
 */
import java.util.Scanner;
public class Q7Factorial 
{
	static int fact = 1;
	static void factorial(int num)
	{
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
