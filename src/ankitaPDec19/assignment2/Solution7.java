package ankitaPDec19.assignment2;
/*Find all pairs on integer array whose sum is equal to given number?
Hint: You have given an integer array and a number, you need to write a program to find all elements in the array 
whose sum is equal to the given number. Remember, the array may contain both positive and negative numbers, 
so your solution should consider that. Input:2, 4, 3, 5, 7, 8, 9 Given sum:7 Integer numbers, whose sum is equal to value:7 (2, 5) (4, 3)*/

public class Solution7 {
	public static void main (String [] args)
	{
		int [] arr = {2, 4, 3, 5, 7, 8, 9};
		int num = 7;
		sum(arr,num);
	}
	static void sum (int [] arr, int num)
	{
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i<arr.length; i++)
		{
			for (int j = 1; j<arr.length; j++)
			{
				if(arr[i]+arr[j] == num)
				{
					num1 = arr[i];
					num2 = arr[j];
					System.out.println("The number whose sum in equal to 7 " +  num1 + "," + num2);
					
				}
			}
		}
	}
	
}
					 
					

			
