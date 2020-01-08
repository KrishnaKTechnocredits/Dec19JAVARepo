package shivaniGDec19.assignment1;

import java.util.Scanner;

public class CountCharacters {
	static void count(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " : " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (i == str.indexOf(currentChar))
				count(str, currentChar);
		}
		sc.close();
	}

}
