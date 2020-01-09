package sonalPDec19.assignment2;
/*
 * Find first differ index from given arrays.
 * i/p :-  arr1: {10,2,9,14,3}   arr2: {10,2,18,14,3} 
 * o/p :-  Values are not matching at index -> 2
 */

public class Question8 {

	static void findFirstDiffIndex(int[] input1, int[] input2)
	{
		for(int i=0; i<input1.length; i++)
		{
			if(input1[i] != input2[i])
			{
				System.out.println("Values are not matching at index -> "+i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		findFirstDiffIndex(arr1, arr2);
	}
}