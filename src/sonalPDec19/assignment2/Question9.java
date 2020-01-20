package sonalPDec19.assignment2;
/*
 * Find all differ index from given arrays 
   i/p :- arr1: {10,2,9,14,3}   arr2: {10,2,18,14,13} 
   o/p :- Values are not matching at index -> 2               
		  Values are not matching at index -> 4 
 */

public class Question9 {
	
	static void findAllDiffIndex(int[] input1, int[] input2)
	{
		for(int i=0; i<input1.length; i++)
		{
			if(input1[i] != input2[i])
			{
				System.out.println("Values are not matching at index -> "+i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		findAllDiffIndex(arr1, arr2);
	}
}
