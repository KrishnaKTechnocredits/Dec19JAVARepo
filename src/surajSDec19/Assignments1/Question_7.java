package surajSDec19.Assignments1;

/*You are given two numbers N and M, print the absolute difference between two numbers 
 *
 * Author: Suraj Shinde
 * */
import java.util.Scanner;

public class Question_7 {

	void absoluteDifferenceMethod(int a, int b) {
		int z = a - b;
		if (z < 0) {
			z = z * (-1);
		}
		System.out.println("The absolute difference between two numbers is: " + z);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number N: ");
		int n = in.nextInt();

		System.out.println("Enter 2st number M: ");
		int m = in.nextInt();

		Question_7 question_7 = new Question_7();
		question_7.absoluteDifferenceMethod(n, m);

	}

}