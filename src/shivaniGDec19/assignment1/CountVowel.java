package assignment1;

import java.util.Scanner;

public class CountVowel {
	static void count(String str) {
		int aCnt = 0, eCnt = 0, iCnt = 0, oCnt = 0, uCnt = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a') {
				aCnt++;
			} else if (ch == 'e') {
				eCnt++;
			} else if (ch == 'i') {
				iCnt++;
			} else if (ch == 'o') {
				oCnt++;
			} else if (ch == 'u') {
				uCnt++;
			}
		}
		System.out.println("Vowel count is as below: ");
		System.out.println("Count of 'a' : " + aCnt);
		System.out.println("Count of 'e' : " + eCnt);
		System.out.println("Count of 'i' : " + iCnt);
		System.out.println("Count of 'o' : " + oCnt);
		System.out.println("Count of 'u' : " + uCnt);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		count(str);
		sc.close();
	}

}
