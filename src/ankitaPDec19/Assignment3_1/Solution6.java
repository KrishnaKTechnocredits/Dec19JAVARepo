/*WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet
 * */
package ankitaPDec19.Assignment3_1;

import java.util.stream.IntStream;

public class Solution6 {
	static String word = "null";

	public static void main(String[] args) {
		String[] str = { "all the best", "technocredits", "", "maharashtra" };
		maxstring(str);
	}

	static void maxstring(String[] str) {
		int maxlength = 0;
		for (int i = 0; i < str.length; i++) {
			int l = str[i].length();
			if (maxlength < l) {
				maxlength = l;
				word = str[i];
			}
		}
		reverse(word);
	}

	static void reverse(String s) {
		String ans = "";
		for (int j = s.length() - 1; j >= 0; j--) {
			ans = ans + String.valueOf(word.charAt(j));
		}
		System.out.println(ans);
	}
}
