package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find average of user given array
	a. Input :- {14, 32, 19, 14, 78,36}
	b. Output:- 32.16
 */
public class Question9
{
	static double average;
	static double sum;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the aray Size :");
		int size= sc.nextInt();
		int[] input=new int[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<size;i++)
		{
			input[i]=sc.nextInt();
		}	
		average(input);
		average=sum/size;
		System.out.println("The Average is :"+average);
	}
	static void average(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		System.out.println("The sum is :"+sum);
		
	}
}
