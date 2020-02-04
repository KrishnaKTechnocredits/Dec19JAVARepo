package chaitanyaKDec19.AssignmentThree;

public class Question06 {

	void displayLongestString(String[] string) {

		String longestString = "";
		int maxLength = 0;

		// finding longest string from given array and storing it in a variable
		for (int i = 0; i < string.length; i++) {

			if (string[i].length() > maxLength) {

				maxLength = string[i].length();
				longestString = string[i];

			}

		}

		System.out.println("Max length string is: " + longestString);
		System.out.print("Max length string reverse value is: ");
		int j = maxLength - 1;

		// displaying longest string in reverse format
		while (j >= 0) {

			System.out.print(longestString.charAt(j));
			j--;
		}

	}

}
