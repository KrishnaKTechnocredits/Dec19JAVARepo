package surajSDec19.Assignment2;

/*
 * 1) Find the missing number in integer array of 1 to 10?
 *Hint: You have given an integer array which contains numbers from 1 to 10 but one
 *number is missing, you need to write a Java program to find that missing number in an
 *array.
 * 
 * Author: Suraj Shinde
 * 
 * */

public class Question_1 {

	public int sumOfArrayInt(int arr[]) {
		int sum = 0; // variable sum is defined
		for (int i = 0; i < arr.length; i++) // for loop to iterate array input from 0 index to last index oaf array
		{
			sum = sum + arr[i]; // summation of all the integer value in array stored in sum variable
		}
		return sum; // this method is returning value of sum variable
	}

	public void missingArrayNumber(int totalArrSum, int n) {
		int totalSumInt = (n * (n + 1)) / 2; // Total sum of 1 to 10 integer value stored in totalSumInt variable
		int missingNum = totalSumInt - totalArrSum; // total sum of integer minus total sum of array integer and stored
													// in missingNum variable
		System.out.println("Missing number from 1 to 10 count is: " + missingNum); // Printed the missing value
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 }; // Array input of 1 to 10 with missing number 6
		Question_1 question_1 = new Question_1(); // object created for class Question_1
		int totalArrSum = question_1.sumOfArrayInt(arr); // sumOfArrayInt method called with array input parameter
		question_1.missingArrayNumber(totalArrSum, 10); // missingArrayNumber method called with return value of
														// sumOfArrayInt method and last number of input

	}

}
