package surajSDec19.Assignments1;
/*Write a program to print the sum of element’s squares of an array having size of N.
 * 
 * Author: Suraj Shinde
 * */
import java.util.Scanner;

public class Question_4 {

	void squareSum(int[] arr) {
		int totalSum = 0;
		int elementSquare = 0;
		for (int i = 0; i < arr.length; i++) {
			elementSquare = arr[i] * arr[i];
			totalSum = totalSum + elementSquare;
		}
		System.out.println("Total sum of square of elements of array: " + totalSum);
	}

	public int[] arrayIntialization() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length of array:");
		int n = in.nextInt();
		int[] arr = new int[n];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 2;
		arr[3] = 1;
		return arr;

	}

	public static void main(String[] args) {
		Question_4 question_4 = new Question_4();
		int[] arrInt = question_4.arrayIntialization();
		question_4.squareSum(arrInt);
	}
}
