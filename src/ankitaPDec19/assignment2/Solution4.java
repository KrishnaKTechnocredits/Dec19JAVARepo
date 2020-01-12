package ankitaPDec19.assignment2;

/*Largest and smallest number in unsorted array?
Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}.*/

public class Solution4 {
	
	public static void main (String [] args)
	{
		int [] arr = {2, 6, 3, 9, 11};
	    Solution4 solution4 = new Solution4();
	    solution4.largest(arr);
	    solution4.smallest(arr);
	}
	
	void largest(int [] a)
	{
		int largest = a[0];
		for (int i = 0; i<a.length; i++)
		{
			if (largest < a[i])
			{
		       largest = a[i];
			}
		}System.out.println("The largest number in array is " + largest);
	}
	
	void smallest(int [] a)
	{
		int smallest = a[0];
		for (int i = 0; i<a.length; i++)
		{
			if (smallest > a[i])
			{
		       smallest = a[i];
			}
		}System.out.println("The smallest number in array is " + smallest);
	}


}
