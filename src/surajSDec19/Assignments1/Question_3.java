package surajSDec19.Assignments1;
/*Write a program to print the sum of all the element of an array of size having N.
 * 
 * Author: Suraj Shinde
 * */
import java.util.Scanner;

public class Question_3 {
	void sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {

			sum = sum + arr[i];
		}
		System.out.println("Sum of all the elements of an Array of size 4 is : " + sum);
	}

	int[] arrayInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of array:");
		int n = input.nextInt();
		int[] arr = new int[n];

		arr[0] = 12;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		//arr[6] = 4;
		// System.out.print(arr);
		return arr;
	}

	public static void main(String[] args) {
		Question_3 question_3 = new Question_3();
		question_3.sum(question_3.arrayInput());

	}

}
