package assignment3;

/*
 * WAP to find average of user given array
	a. Input :- {14, 32, 19, 14, 78,36}
	b. Output:- 32.16
 */
import java.util.Scanner;

public class Question9 {

	static void findAverage() {
		/*
		 * Method will take elements from user and will print average of given inputs.
		 */

		double sum = 0.0;
		double average = 0.0;
		Scanner s = new Scanner(System.in);
		System.out.print("Total no of elements: ");
		int size = s.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter number" + (i + 1) + ": ");
			array[i] = s.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		average = sum / size;
		System.out.println("Average of array elements: " + average);
	}

	public static void main(String[] args) {
		findAverage();

	}

}
