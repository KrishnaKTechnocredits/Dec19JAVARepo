package assignment3;
/*
 * WAP to find frequency of user defined character in user defined String
	a. i.e. User String :- “electrical engineering”
	b. i.e. User Char:- ‘e’
	c. count of e :- 5
 */

import java.util.Scanner;

public class Question3 {

	static void findCharacterFreq() {
		/*
		 * This method will take string and character as user input and will print
		 * character frequency in string.
		 */
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string:-");
		String inputUserString = s.nextLine();
		System.out.println("Enter character:- ");
		String inputChar = s.next();

		for (int i = 0; i < inputUserString.length(); i++) {
			if (inputChar.charAt(0) == inputUserString.charAt(i))
				count++;
		}

		System.out.println("Count of character " + inputChar + " in string: " + count);
	}

	public static void main(String[] args) {
		findCharacterFreq();
	}

}
