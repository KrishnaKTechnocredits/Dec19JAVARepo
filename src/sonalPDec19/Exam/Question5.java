package sonalPDec19.Exam;
/*
 * 5) WAP to Remove all non-alphabetical characters of a String in Java
Input: Hello, How are you?
Output: Hello How are you
 */

public class Question5 {

	static void removeNonAlpha(String s) {
		String newStr = " ";
		for (int i = 0; i < s.length(); i++)
			if (Character.isAlphabetic(s.charAt(i)) || Character.isSpace(s.charAt(i))) {
				newStr = newStr + s.charAt(i);
			}
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		String s = "Hello, How are you?";
		removeNonAlpha(s);
	}
}
