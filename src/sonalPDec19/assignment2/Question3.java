package sonalPDec19.assignment2;
/*
 * Check if array contains a number in Java? 
 * i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 
 * o/p :- number is not in array.
 */

public class Question3 {
	
	static boolean flag = true;
	static void searchNum(int num, int[] input)
	{
		for(int i=0; i<input.length; i++)
		{
			if(num == input[i])
			{
				System.out.println("Number "+ num+ " is available in given array.");
				flag = false;
				break;
			}
		}
		if(flag == true)
		System.out.println("Number "+ num+ " is not available in given array.");
	}
	
	public static void main(String[] args) {
		int[] array =  {2,5,9,7,4,6};
		int num = 8;
		searchNum(num, array);
	}

}
