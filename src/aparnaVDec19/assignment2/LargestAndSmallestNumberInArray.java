package aparnaVDec19.assignment2;
/*
 * 4) Largest and smallest number in unsorted array?
       Hint: For example, if input integer array is {2, 6, 3, 9, 11} then smallest number is 2 
       and largest number 11.
 */
public class LargestAndSmallestNumberInArray {
	static void largestSmallestNumberFind(int[] arr)
	{
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("Largest number in Given Array is:- > " + largest);
		System.out.println("Smallest number in Given Array is:- > " + smallest);
	}
	
	public static void main(String[] args)
	{
		int arr[]={2, 6, 3, 9, 11};
		largestSmallestNumberFind(arr);
	}

}
