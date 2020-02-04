package kedarKDec19.Assignment3;

public class Question3 {

	/*
	 * find frequency of user defined
	 * 
	 * 
	 */

	static void occur(String s, char ch) {

		int chcount = 0;
		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == ch)
				chcount++;
			i++;
		}

		System.out.println("The occurance of given character" + ch + "in a given string is :" + chcount);
	}

	public static void main(String[] args) {
		String s = "electrical enginerring";
		char ch = 'e'; 
		occur(s, ch);
	}

}
