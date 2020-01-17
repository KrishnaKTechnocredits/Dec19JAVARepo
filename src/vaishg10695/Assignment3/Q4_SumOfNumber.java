package vaishg10695.Assignment3;

import java.util.Scanner;

public class Q4_SumOfNumber {

	void NumberSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		System.out.println("sum of given number is: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a numbers");
		int num = sc.nextInt();

		Q4_SumOfNumber son = new Q4_SumOfNumber();

		son.NumberSum(num);
	}

}
