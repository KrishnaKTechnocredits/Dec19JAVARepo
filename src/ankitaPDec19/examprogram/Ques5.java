/*5) WAP to Remove all non-alphabetical characters of a String in Java
Input: Hello, How are you?
	Output: Hello How are you  */

package ankitaPDec19.examprogram;

public class Ques5 {
	public static void main(String[] args) {
		String s = "Hello, How are you";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			s = str[i];
			display(s);
		}
	}

	static void display(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				str = str + String.valueOf(s.charAt(i));
			}
		}
		System.out.print(str + " ");
	}

}
