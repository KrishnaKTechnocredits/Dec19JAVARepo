package kedarKDec19.Assignment3;

public class Question2 {

	/*
	 * max length of string array
	 * 
	 * 
	 */

	static String getLongest(String[] s) {
		int n = 0;
		String m = null;
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > n) {
				n = s[i].length();
				m = s[i];

			}

		}
		return m;
	}

	public static void main(String[] args) {
		String[] s = { "all the best", "technocredits", "", "maharastra" };
		String longest = getLongest(s);
		System.out.println(longest);

	}

}
