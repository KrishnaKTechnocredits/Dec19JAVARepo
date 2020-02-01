/*WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. i.e. User Char:- ‘e’
c. count of e :- 5*/
package ankitaPDec19.Assignment3_1;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		System.out.println("Enter the char:");
		char ch = s.next().charAt(0);
		display(str, ch);
		System.out.println("The count of  " + ch + " is " + display(str, ch));
	}

	static int display(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				count++;
		}
		return count;
	}

}
