package shivaniGDec19.assignment3;

import java.util.Scanner;

//WAP to find to number is palindrom or not
public class PalindromeNumber {
	static void palindrome(int num) {
		int temp = 0;
		int rev = 0;
		int n = num;
		while (num > 0) {
			temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		if (rev == n) {
			System.out.println(n + " is a palindrome");
			System.out.println("Reverse number is : " + rev);
		} else
			System.out.println(n + " is not a palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " + num);
		palindrome(num);
		sc.close();
	}
}
