/*8) WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11*/
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(count(str));
	}

	static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u'))
				count++;
		}
		return count;
	}

}
