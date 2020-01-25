/*
 * WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class PositiveNegative {
	int[] setArray()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the lenght of array : ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for (int i=0; i<len; i++)
		{
			System.out.println("Enter number");
			arr[i]= scan.nextInt();
		}
		scan.close();
		return arr;

	}
	void getNArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
				System.out.println(arr[i]+"\t");
		}
	}
	void getPArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>=0)
				System.out.println(arr[i]+"\t");
		}
	}
	int positiveSum(int[] arr)
	{
		int sum = 0;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]>=0)
				sum =sum+arr[i];
		}
		return sum;
	}
	int negativeSum(int[] arr)
	{
		int sum = 0;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
				sum =sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		PositiveNegative p = new PositiveNegative();
		int[] arr = p.setArray();
		System.out.println("Positive numbers are : " );
		p.getPArray(arr);
		System.out.println("Negative numbers are : ");
		p.getNArray(arr);
		int nsum = p.negativeSum(arr);
		int psum=p.positiveSum(arr);
		System.out.println("Positive Number Sum is :"+psum + '\n' + "Negative Number sum is :" + nsum);
		
			}

}
