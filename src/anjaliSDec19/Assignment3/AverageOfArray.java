/*
 * WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class AverageOfArray {

	int[] setArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of array");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for (int i=0; i<len;i++)
		{
			System.out.println("Enter the array element : ");
			arr[i]=scan.nextInt();
		}
		scan.close();
		return arr;
	}
	
	float calcAvaerage(int[] arr)
	{
		int len = arr.length;
		float sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		float avg=sum/len;
		return avg;
	}
	public static void main(String[] args) {
		AverageOfArray a = new AverageOfArray();
		int[] arr =a.setArray();
		float avg=a.calcAvaerage(arr);
		System.out.println("Average of entered elements is : "+avg);
	}
}
