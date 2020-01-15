package chaitanyaKDec19.AssignmentThree;

public class Question02 {

	void displayLongestString(String[] string) {

		String longestString = "";
		int maxLength = 0;

		for (int i = 0; i < string.length; i++) {

			if (string[i].length() > maxLength) {

				maxLength = string[i].length();
				longestString = string[i];

			}

		}

		System.out
				.println("Longest string from given input is: " + longestString + " and it's length is: " + maxLength);

	}

}
