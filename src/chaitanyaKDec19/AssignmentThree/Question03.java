package chaitanyaKDec19.AssignmentThree;

public class Question03 {

	void displayCharCount(String string, char ch) {

		int chCount = 0;
		int i = 0;

		while (i < string.length()) {

			if (string.charAt(i) == ch)
				chCount++;

			i++;

		}

		System.out.println("The occurance of given character " + ch + " in a given string is: " + chCount);

	}

}
