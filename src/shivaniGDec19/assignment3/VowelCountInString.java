package shivaniGDec19.assignment3;

import java.util.Scanner;

public class VowelCountInString {
	int vowel;

	void findVowel(String s) {
		System.out.print("Vowels are : ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vowel++;
				System.out.print(s.charAt(i) + " ");
			}
		}
		System.out.println();
		System.out.println("Count : " + vowel);

	}

	public static void main(String[] args) {
		VowelCountInString vowel = new VowelCountInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		vowel.findVowel(str);
		sc.close();

	}

}
