package chaitanyaKDec19.AssignmentThree;

public class Question12 {

	void checkIfPalindrome(String string) {

		boolean flag = true;

		// checking if string is equal from start as well as end till middle of the
		// string
		for (int i = 0, j = string.length() - 1; i <= string.length() / 2; i++, j--) {

			if (string.charAt(i) != string.charAt(j)) {
				flag = false;
				break;
			}

		}

		// printing appropriate result to show if string is Palindrome
		if (flag)
			System.out.println("Given string: " + string + " is a Palindrome string");
		else
			System.out.println("Given string: " + string + " is a not Palindrome string");
	}

}
