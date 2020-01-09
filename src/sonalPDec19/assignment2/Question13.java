package sonalPDec19.assignment2;
/*
 * WAP to reveres array 
 * a. int inputArray = {5, 6, 9, 10, 14, 63} 
 * b. outputArray = {63, 14, 10, 9, 6, 5} 
 */

public class Question13 {
	
	static void doReverse(int[] input)
	{
		for(int i=input.length-1; i>=0; i--)
		{
			System.out.print(input[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] inputArray = {5, 6, 9, 10, 14, 63};
		doReverse(inputArray);
	}

}
