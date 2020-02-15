package testProg;

public class Question5 {

	static String findSpecial(String s) {
		Character ch = ' ';
		String alpha = "";
		{
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);

				if (Character.isLetter(ch)) {
					alpha = alpha + ch;
				}
			}
			return alpha;
		}
	}

	public static void main(String[] args) {
		String str = "Hello, How are you";

		String[] splitArray = str.split(" ");
		String[] strArray = new String[splitArray.length];
		for (int i = 0; i < splitArray.length; i++) {
			strArray[i] = findSpecial(splitArray[i]);
		}
		for (String print : strArray) {
			System.out.print(print + " ");
		}
	}
}
