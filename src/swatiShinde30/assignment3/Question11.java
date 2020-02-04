package swatiShinde30.assignment3;

import java.util.Scanner;

/*
 * WAP to find number is palindrome or not ? 
 */
public class Question11 {
	static void palindrom(String str) {
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println("Number is palindrom");
		} else
			System.out.println("Number is not palindrom");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		String str = Integer.toString(number);
		palindrom(str);
	}

}
