package sonalPDec19.Exam;
/*
 * 1) WAP to Move all Uppercase char to the end of string

Input: Hellow There
	Output: ellow hereHT
 */

public class Question1 {
	static String upperCase = "";
	static String lowerCase = "";
	static void moveCharacter(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				upperCase = upperCase + str.charAt(i);
			} else {
				lowerCase = lowerCase + str.charAt(i);
			}
		}
		System.out.println("New String: " + (lowerCase + upperCase));
	}
	
	public static void main(String[] args) {
		String str = "Hellow There";
		// String[] strArray = str.split(" ");
		moveCharacter(str);
	}
}
