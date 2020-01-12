package aparnaVDec19.assignment2;
/*
 * 2) Find duplicate number on Integer array in Java?
      Hint: There is exactly one number is repeated in the array. 
      You need to write a program to find that duplicate number. 
      For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, 
      then duplicated number is 3.
 */
public class DuplicateNumberInArray {
	
	static void displayDuplicateNumber(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{   
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Number In Array is :> "+ arr[i]);
				}
			}	
		}
	}
	public static void main(String[] args)
	{ 
		int[] arr={0, 3, 1, 2, 3};
		displayDuplicateNumber(arr);
	}

}
