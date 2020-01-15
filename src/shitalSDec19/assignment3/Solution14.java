/*  WAP to find unique number from given array store that numbers in new array. 
a. firstArray:- {1,2,3,4,2,5} 
b. secondArray:- {5,6,7,8,9,7} 
c. unique array = {1,2,3,4,5,6,7,8,9} 
i. order can be anything  */

package shitalSDec19.assignment3;

public class Solution14 {
	int [] arr3 = {};
	void findUniqueNo(int [] arr1, int [] arr2)
	{
		if (arr1.length == arr2.length)
		{
			for (int i = 0; i<arr1.length; i++)
			{
				for (int j=0; j<arr2.length; j++)
				{
					if (arr1[i] != arr2[j])
						
				arr3 = arr2;
					System.out.println(arr3[i]);
				}
				
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,2,5};
		int [] arr2 = {5,6,7,8,9,7};
		Solution14 solution14 = new Solution14();
		solution14.findUniqueNo(arr1, arr2);
		
	}


}
