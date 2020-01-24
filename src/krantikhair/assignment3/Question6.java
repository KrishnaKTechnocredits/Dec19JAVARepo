/*
 * ) WAP to find reverse max length string  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} b. Output Max length string :- Technocredits c. Max length string reverse value :- stiderconhcet 
 */

package krantikhair.assignment3;

public class Question6 {

	public static String LongestString(String[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > a[i + 1].length()) {
				return a[i];
			}

		}

		return null;

	}

	public static void main(String[] args) {
		String[] a = { "all the best", "technocredits", "", "maharashtra" };
		String Longest = LongestString(a);
		String reverse = "";
		for (int i = Longest.length() - 1; i >= 0; i--) {

			reverse = reverse + Longest.charAt(i);

		}

		System.out.println("The longest string in the array is" + ":" + Longest);
		System.out.println("Reverse of the string: " + reverse);

	}

}
