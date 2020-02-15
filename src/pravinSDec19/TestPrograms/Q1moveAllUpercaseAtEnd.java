package pravinSDec19.TestPrograms;

/*
1) WAP to Move all Uppercase char to the end of string
	Input: Hellow There
	Output: ellow hereHT

 * 
 * 
 */

public class Q1moveAllUpercaseAtEnd {

	static String moveUppercaseToEnd(String str) {

		String onlyStr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			if (Character.isLowerCase(ch) || Character.isWhitespace(ch)) {

				onlyStr = onlyStr + ch;
			}

		}
		for (int i = 0; i < onlyStr.length(); i++) {

			ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				onlyStr = onlyStr + ch;
			}

		}

		return onlyStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello There";

		String onlyStr = moveUppercaseToEnd(str);
		System.out.println(onlyStr);

	}

}
