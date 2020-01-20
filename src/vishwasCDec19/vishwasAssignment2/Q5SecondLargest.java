package vishwasCDec19.vishwasAssignment2;
/*
 * Write a java program to find second largest element in an array of integers
 */

public class Q5SecondLargest 
{
	static void secondLargest(int[] arr)
	{
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > largest) 
			{
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) 
			{
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		
	}
		 public static void main(String[] args)
		 {
			 int arr1[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
			 secondLargest(arr1);
		}
}


