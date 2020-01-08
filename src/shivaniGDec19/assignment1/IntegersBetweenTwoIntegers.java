package assignment1;

import java.util.Scanner;

public class IntegersBetweenTwoIntegers {

	static void search(int start, int end) {
		System.out.println("Elements between " + start + " and " + end + " are :");
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting element: ");
		int start = sc.nextInt();
		System.out.println("Enter last element: ");
		int end = sc.nextInt();
		search(start, end);
		sc.close();
	}

}
