package sameerDDec19.Assignment3;
import java.util.Scanner;
/*
 * WAP which fulfill below condition
	a. WAP to find positive and negative number from the given array
	b. check the sum of individual.
 */
public class Question1
{
	static int positiveSum;
	static int negativeSum;
	static void number(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			if(input[i]<0)
			{
				System.out.print(" "+input[i]);
				negativeSum=negativeSum+input[i];
			}
			else
			{
				positiveSum=positiveSum+input[i];
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[]input=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Elements");
			input[i]=sc.nextInt();
		}
		System.out.print("Positive Numbers are");
		for(int i=0;i<size;i++)
		{
			if(input[i]>0)
			{
				System.out.print(" "+input[i]);
			}
		}
		System.out.print("\nNegative Numbers are ");
		number(input);
		System.out.println("\nNegative sum is "+negativeSum * (-1));
		System.out.println("Positive Sun is "+positiveSum);
	}
}
























