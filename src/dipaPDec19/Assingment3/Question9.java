package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to find average of user given array
	a. Input :- {14, 32, 19, 14, 78, 36}
	b. Output:- 32.16
 */
public class Question9 {
	public static void main(String[] args) {

		Question9 que9 = new Question9();

		System.out.println("How many numbers you want to enter ");

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		int i = 0;

		while (i < size) {
			System.out.println("Enter input");
			array[i] = s.nextInt();
			i++;
		}

		System.out.println("The average of an array is " + que9.getAverage(array));
	}

	double getAverage(int[] array1) {
		int i = 0;
		double avg = 0, num = 0;

		while (i < array1.length) {
			num = num + array1[i]; // Get sum of an array integers.
			i++;
		}
		avg = num / array1.length; // Get average of an array integers.

		return avg;
	}

}
