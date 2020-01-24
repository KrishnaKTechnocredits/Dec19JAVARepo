package pravinSDec19.assignment3;

import java.util.Scanner;

/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 3
	WAP to find frequency of user defined character in user defined String
	a. i.e. User String :- “electrical engineering”
	b. i.e. User Char:- ‘e’
	c. count of e :- 5
 * 
 * 
 */

public class Question3 {

	// acceptStringInputFromUser is method to take string as input and return that
	// user defined string
	String acceptStringInputFromUser() {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		return str;

	}

	// displayMaxLenghString method is used to find largest length string from given
	// array
	void displayFrequencyOfCharInString(String name, char ch) {

		int cnt = 0;
		String lowerStr = name.toLowerCase();

		for (int i = 0; i < lowerStr.length(); i++) {

			if (ch == lowerStr.charAt(i))
				cnt++;

		}

		System.out.println("Frequency of " + ch + " in " + name + " is " + cnt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question3 q2 = new Question3();

		System.out.println("Enter user defined string ");
		String str = q2.acceptStringInputFromUser();

		System.out.println("Enter user defined character to find frequency in given string ");
		char ch = q2.acceptStringInputFromUser().charAt(0);

		q2.displayFrequencyOfCharInString(str, ch);

	}
}
