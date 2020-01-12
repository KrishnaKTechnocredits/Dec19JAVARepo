package yashashrikDec19.Assignment2;
/*2) Find duplicate number on Integer array in Java?
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
1, 2, 3}, then duplicated number is 3.
*/

public class DuplicateNumQ2 {
	void displayDuplicate(int[] arr)
	{
		//int DupNum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					
					System.out.println("Duplicate number is " +arr[i]);
				
				}
			}
			//System.out.println(i);
		}
	}
	
	
	public static void main(String args[])
	{
		DuplicateNumQ2 dup=new DuplicateNumQ2();
		int[] num={0,3,2,2,3};
		dup.displayDuplicate(num);
		
	}

}
