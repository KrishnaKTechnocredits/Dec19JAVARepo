/* )Write a java program to check the equality of two arrays? 
 
Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal  */package shitalSDec19.assignment2;

public class Solution6 {
	void checkEquality(int [] arr1, int[] arr2)
		{  
			if (arr1.length == arr2.length)
			{
				int count=0;
				for (int i = 0;i<arr1.length; i++)
				{
					if (arr1[i] == arr2[i])
							count++;					
					else
						System.out.println("Two array values are NOT Equal");
				}
				if (count ==arr1.length)
					System.out.println("Two array values are Equal");
			}
			
			
		}
	
	public static void main(String args[])
	{
		int [] arr1 = {21, 57, 11, 37, 2};
		int [] arr2 = {21, 57, 11, 37, 2};
		Solution6 solution6 = new Solution6();
		solution6.checkEquality(arr1, arr2);
		
		
		
		
	}
}


