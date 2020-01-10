package shivaniGDec19.assignment1;

import java.util.Scanner;

public class AbsoluteDifference {
	static void difference(int m, int n) {
		int diff = 0;
		diff = m - n;
		if (diff < 0)
			diff = diff * (-1);
		System.out.println("Difference between two numbers is :" + diff);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first and second number:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		difference(m, n);
		sc.close();

	}

}
