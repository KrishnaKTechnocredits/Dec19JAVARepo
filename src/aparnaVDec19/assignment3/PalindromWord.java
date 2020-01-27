package aparnaVDec19.assignment3;

/*
 * 12) WAP to find word is palindrome or not ?
      a. String name = “naman”
      i. Naman is palindrome
      b. String name = “harsh”
      i. Harsh is not palindrome
 */
public class PalindromWord {

	static void isWordIsPalindromOrNot(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);

		if (str.equals(reverse)) {
			System.out.println(str + " is Palindrome ");
		} else {
			System.out.println(str + " is not Palindrome");
		}

	}

	public static void main(String[] args) {
		String str = "naman";
		isWordIsPalindromOrNot(str);

		String str1 = "Harsh";
		isWordIsPalindromOrNot(str1);
	}
}
