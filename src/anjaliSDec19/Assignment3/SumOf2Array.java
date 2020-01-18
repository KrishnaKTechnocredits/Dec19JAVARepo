/*
 * WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class SumOf2Array {
	Scanner scan = new Scanner(System.in);
	int[] setArray()
	{
		
		System.out.println("Enter the length of array : ");
		int len =scan.nextInt();
		int[] arr= new int[len];
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter array element: ");
			arr[i] = scan.nextInt();
		}
		//scan.close();
		return arr;
	}
	int sumOfArray(int[] arr1, int[] arr2)
	{
		int sum=0;
		for(int i=0; i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		for(int i=0; i<arr2.length;i++)
		{
			sum=sum+arr2[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		SumOf2Array obj1 =new SumOf2Array();
		int[] arr1 = obj1.setArray();
		int[] arr2 = obj1.setArray();
		int sum = obj1.sumOfArray(arr1, arr2);
		System.out.println("Sum of both the array elements is : "+ sum);
		
	}
}
