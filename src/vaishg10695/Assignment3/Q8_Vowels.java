/*8) WAP to find vowels in given string  
 * a. Input :- automation engineering 
 * b. Count :- 11 */

package vaishg10695.Assignment3;

import java.util.Scanner;

public class Q8_Vowels {

	void VowelsCount(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U')
				cnt++;
		}
		System.out.println("Vowels Count in the string is : " + cnt);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String: ");
		String str = sc.nextLine();

		Q8_Vowels v = new Q8_Vowels();
		v.VowelsCount(str);
	}

}
