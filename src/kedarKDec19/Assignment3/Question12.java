package kedarKDec19.Assignment3;

public class Question12 {

	static void palindrome(String s) {
		boolean flag = true;

		// if string is equal from start as well as end till middle of the

		for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {

			if (s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}

		}

		// printing appropriate result to show if string is Palindrome
		if (flag)
			System.out.println("Given string: " + s + " is a Palindrome string");
		else
			System.out.println("Given string: " + s + " is a not Palindrome string");
	}

	public static void main(String[] args) {
		String s = "naman";
		palindrome(s);
	}

}
