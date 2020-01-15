package chaitanyaKDec19.AssignmentThree;

public class Question12 {

	void checkIfPalindrome(String string) {

		boolean flag = true;

		for (int i = 0, j = string.length() - 1; i <= string.length() / 2; i++, j--) {

			if (string.charAt(i) != string.charAt(j)) {
				flag = false;
				break;
			}

		}

		if (flag)
			System.out.println("Given string: " + string + " is a Palindrome string");
		else
			System.out.println("Given string: " + string + " is a not Palindrome string");
	}

}
