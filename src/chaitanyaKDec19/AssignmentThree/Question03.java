package chaitanyaKDec19.AssignmentThree;

public class Question03 {

	void displayCharCount(String string, char ch) {

		int chCount = 0;
		int i = 0;

		// Counting occurrence of character in given string
		while (i < string.length()) {

			if (string.charAt(i) == ch)
				chCount++;

			i++;

		}

		// Printing occurrence of character in a given string
		System.out.println("The occurance of given character " + ch + " in a given string is: " + chCount);

	}

}
