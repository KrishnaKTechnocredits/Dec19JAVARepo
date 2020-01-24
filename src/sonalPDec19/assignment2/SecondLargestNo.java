package sonalPDec19.assignment2;
/*
 * Write a java program to find second largest element in an array of integers? 
 */

public class SecondLargestNo {

	void findSecondLargestNo(int[] input) {
		int largestNo = input[0];
		int secondLargest = input[0];
		for (int i = 0; i < input.length; i++)
			if (input[i] > largestNo) {
				secondLargest = largestNo;
				largestNo = input[i];
			} else if (input[i] > secondLargest) {
				secondLargest = input[i];
			}

		System.out.println("Second Largest No: " + secondLargest);
	}

	public static void main(String[] args) {
		SecondLargestNo secondlargestno = new SecondLargestNo();
		int[] array = { 10, 15, 12, 20, 19, 3 };
		secondlargestno.findSecondLargestNo(array);
	}

}
