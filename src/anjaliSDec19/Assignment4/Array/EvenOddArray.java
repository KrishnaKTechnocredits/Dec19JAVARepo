/*
 * 3.	Write a program to find the number of even and odd integers in a given array ofintegers.
 */
package anjaliSDec19.Assignment4.Array;

import java.util.Scanner;

public class EvenOddArray {
	
	int[] setArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of array : ");
		int len = Integer.parseInt(scan.nextLine());
		int arr[]=new int[len];
		for(int i=0; i<len;i++)
		{
			System.out.print("Enter the array element : ");
			arr[i]=Integer.parseInt(scan.nextLine());
		}
		scan.close();
		return arr;
	}

	void evenArray(int[] arr)
	{
		int cnt=0;
		System.out.print("Even : ");
		for(int i =0; i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				System.out.print(arr[i] +" ");
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("There are no even numbers in the array.");
	}
	void oddArray(int[] arr)
	{
		int cnt=0;
		System.out.print("Odd : ");
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i] +" ");
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("There are no odd numbers in the array.");
	}
	public static void main(String[] args) {
		EvenOddArray obj = new EvenOddArray();
		int[] arr=obj.setArray();
		obj.evenArray(arr);
		obj.oddArray(arr);
	}
}
