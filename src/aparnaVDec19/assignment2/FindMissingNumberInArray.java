package aparnaVDec19.assignment2;

/*
 * 1) Find the missing number in integer array of 1 to 10?
      Hint: You have given an integer array which contains numbers from 1 to 10 
      but one number is missing, you need to write a 
      Java program to find that missing number in an array.
 */
public class FindMissingNumberInArray {

	static void missingNumber(int[] arr) {
		int number = 10;
		int sum = (number * (number + 1)) / 2;
		int remainder = 0;
		for (int i = 0; i < arr.length; i++) {
			remainder = remainder + arr[i];
		}
		int missingNumber = sum - remainder;
		System.out.println("Missing Number is: > " + missingNumber);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		missingNumber(arr);
	}
}
