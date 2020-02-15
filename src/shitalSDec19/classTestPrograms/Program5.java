//WAp to remove all non-alphabetical characters of a string in java
//input: Hello, How are you?
//Output: Hello How are you

package shitalSDec19.classTestPrograms;

public class Program5 {

	static String s = "Hello, How are you?";

	public static void main(String[] args) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean a = Character.isLetter(ch);
			// System.out.println(a);
			if (a == true) {

				String output = String.valueOf(ch);
				System.out.println(output);
			}
		}
	}
}
