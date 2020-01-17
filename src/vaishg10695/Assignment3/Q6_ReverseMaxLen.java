/*6) WAP to find reverse max length string  
 *  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
	b. Output Max length string :- Technocredits
 	c. Max length string reverse value :- stiderconhcet*/

package vaishg10695.Assignment3;

import java.util.Scanner;

public class Q6_ReverseMaxLen {

	String maxLen(String[] str) {
		int len = 0;
		String maxStr = null;

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > len) {
				len = str[i].length();
				maxStr = str[i];
			}
		}
		return maxStr;
	}

	void ReverseMAx(String s) {
		System.out.print("Max length string reverse : ");
		for (int j = s.length() - 1; j >= 0; j--) {
			System.out.print(s.charAt(j));
		}
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

		Q6_ReverseMaxLen m = new Q6_ReverseMaxLen();
		String s = m.maxLen(str);
		System.out.println("max length string is: " + s);
		m.ReverseMAx(s);
	}
}
