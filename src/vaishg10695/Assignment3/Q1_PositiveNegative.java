/*1) WAP which fulfill below condition 
 * a. WAP to find positive and negative number from the given array   
 * b. check the sum of individual.  
Input array;- {5, 6, -9, 14, -25, 6, 7, -14} 
Output :- expected output of 
a. positive number = {5, 6, 14, 6, 7} 
b. negative number = {-9, -25, -14} 
c. positive number sum :- 38 
d. negative number sum :- 48*/


package vaishg10695.Assignment3;

import java.util.Scanner;

public class Q1_PositiveNegative {
	
	void getPositiveNumberArray(int[] arr)		// gives positive number
	{
		System.out.println("Positive numbers are : " );
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
				System.out.println(arr[i]+"\t");
		}
	}
	
	void getPositiveSum(int[] arr)
	{
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Positive numbers sum is : "+sum );
	}
	
	void getNegativeNumberArray(int[] arr)		// gives negative number
	{
		System.out.println("Negative numbers are : " );
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
				System.out.println(arr[i]+"\t");
		}
	}
	
	void getNegativeSum(int[] arr)
	{
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Negative numbers sum is : "+sum );
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		;// allow to get input runtime
		System.out.print("Enter length of array: ");
		int size=sc.nextInt();
		int [] arr= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter Number : ");
			arr[i]=sc.nextInt();
		}
		
		
		Q1_PositiveNegative pn=new Q1_PositiveNegative();
		
		pn.getPositiveNumberArray(arr);

		pn.getNegativeNumberArray(arr);
		
		pn.getPositiveSum(arr);
		
		pn.getNegativeSum(arr);
		
		
	}

}
