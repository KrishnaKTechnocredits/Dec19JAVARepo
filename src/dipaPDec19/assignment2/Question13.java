package dipaPDec19.assignment2;
/*
 * WAP to reveres array
	a. int inputArray = {5, 6, 9, 10, 14, 63}
	b. outputArray = {63, 14, 10, 9, 6, 5}
 */

public class Question13 {
	public static void main(String[] args) {
		
		int[] inputArray = {5, 6, 9, 10, 14, 63};
		reverseArray(inputArray);
	}

	static void reverseArray(int[] input) {
		
		for(int j= input.length-1; j > 0 ; j--)
		{
			System.out.print(input[j]+ " ");
		}
		
	}
}
