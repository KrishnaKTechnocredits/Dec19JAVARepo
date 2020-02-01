/*2) WAP to find max length String from the given array.
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}*/

package vaishg10695.Assignment3;

import java.util.Scanner;

public class Q2_MaxLength {

	String[] maxLen(String[] str) {
		int len = 0;
		String maxStr = null;
		String[] s1 = new String[2];

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > len) {
				len = str[i].length();
				maxStr = str[i];
			}
		}
		s1[0] = String.valueOf(len);
		s1[1] = maxStr;

		return s1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String length: ");
		int len = Integer.parseInt(sc.nextLine());
		String[] str = new String[len];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter the String: ");
			str[i] = sc.nextLine();
		}

		Q2_MaxLength m = new Q2_MaxLength();
		String[] s = m.maxLen(str);

		System.out.println("Max length is:  " + s[0] + '\n' + "max length string is: " + s[1]);
	}

}
