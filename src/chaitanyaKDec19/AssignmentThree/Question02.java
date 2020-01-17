package chaitanyaKDec19.AssignmentThree;

public class Question02 {

	void displayLongestString(String[] string) {

		String longestString = "";
		int maxLength = 0;

		// Getting string having maximum length and storing it in a variable
		for (int i = 0; i < string.length; i++) {

			if (string[i].length() > maxLength) {

				maxLength = string[i].length();
				longestString = string[i];
			}
		}

		// Printing longest string from given array
		System.out
				.println("Longest string from given input is: " + longestString + " and it's length is: " + maxLength);
	}

}
