package sonalPDec19.assignment2;
/* 
 * Find max value at differed index 
 * i/p => arr1: {10,2,9,14,3}        arr2: {10,2,18,14,3}
 * o/p :- Values are not matching at index -> 2              
 * From (9,18) max value is 18.
 */

public class Question10 {
	
	static void findMax(int[] input1, int[] input2)
	{
		for(int i=0; i<input1.length; i++)
		{
			if(input1[i] != input2[i])
			{
				System.out.println("Values are not matching at index -> "+ i);
				
				if(input1[i]>input2[i])
					System.out.println("Max value from "+ input1[i] + " and " + input2[i] + " is " +input1[i]);
				else
					System.out.println("Max value from "+ input1[i] + " and " + input2[i] + " is " +input2[i]);
			}
			//else
				//System.out.println("Values at same index are equal");
		}
		System.out.println("Other values are equal at respective index.");
	}
		
	public static void main(String[] args) {
		int[] arr1 = {10,2,9,14,13}; 
		int[] arr2 = {10,2,18,14,3};
		findMax(arr1,arr2);
	}
	
}