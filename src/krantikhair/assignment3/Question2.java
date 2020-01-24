
/*
 * 2) WAP to find max length String from the given array. a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
 
 */
package krantikhair.assignment3;

public class Question2 {

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
		System.out.println("The longest string in the array is" + ":" + Longest);

	}

}
