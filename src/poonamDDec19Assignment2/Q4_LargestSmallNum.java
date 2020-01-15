package poonamDDec19Assignment2;
/*
 * Largest and smallest number in unsorted array
 */
public class Q4_LargestSmallNum {
	static void findLargeSmallNum(int [] arr)
	{
		int large = arr[0];
		int small= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large = arr[i];
			
			}
			else if(small>arr[i])
				{
					small = arr[i];
			
				}
		}
		System.out.println("largest no. of array is "+large);
		System.out.println("smallest no. of array is "+small);
	}
	public static void main(String[] args)
	{
		int[] input = {2,6,3,9,11};
		findLargeSmallNum(input);
	}

}
