/*) WAP to print common number from two different array a. int array1 = {1, 3, 6, 9, 7} b. int array2 = {2, 5, 6, 9, 8} output Array :- {6, 9} */

package shitalSDec19.assignment2;

public class Solution12 {

	void commonNo(int []arr1, int[] arr2)
	{
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr2.length;i++)
			{
				if (arr1[i] == arr2[i])
				{
					System.out.println("common number from two different array are " + arr2[i]);
				}			
			}
		}
	}
	public static void main(String args[])
	{
		int [] arr1 = {1, 3, 6, 9, 7};
		int [] arr2 = {2, 5, 6, 9, 8};
		Solution12 solution12 = new Solution12();
		solution12.commonNo(arr1, arr2);
		
		
	}
}
