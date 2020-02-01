/*2) WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 * */
package ankitaPDec19.Assignment3_1;

public class Solution2 {
	static String word = "null";

	public static void main(String[] args) {
		String[] str = { "all the best", "technocredits", "", "maharashtra" };
		maxstring(str);
		System.out.println("The max length word in the String is " + word + " and its length is: " + word.length());
	}

	static String maxstring(String[] str) {
		int maxlength = 0;
		for (int i = 0; i < str.length; i++) {
			int l = str[i].length();
			if (maxlength < l) {
				maxlength = l;
				word = str[i];
			}
		}
		return word;
	}

}
