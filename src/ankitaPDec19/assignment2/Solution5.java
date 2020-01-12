package ankitaPDec19.assignment2;
/*5)Write a java program to find second largest element in an array of integers?*/

public class Solution5 {
	public static void main (String [] args)
	{
		int [] arr = {2, 6, 3, 9, 11};
	    Solution4 solution4 = new Solution4();
	    solution4.largest(arr);
	    /*for (int i = 0; i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }*/
	}
	
	void largest(int [] arr)
	{
		int largest = arr[0];
		for (int i = 0; i<arr.length; i++)
		{
			if (largest < arr[i])
			{
		       largest = arr[i];
		       arr[i] = 0;
		       System.out.println(arr[i]);
			}
		}
	}

}
