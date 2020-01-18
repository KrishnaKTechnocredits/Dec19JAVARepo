package swatiShinde30.assignment3;

import java.util.Scanner;

/*
 * WAP to find word is palindrome or not ? 
 */
public class Question12 {
	static void palindrom(String str) {
		String str2 = "";
		boolean flag = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		System.out.println(str2);
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == str2.charAt(j)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		palindrom(str);
	}

}
