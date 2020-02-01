/*
 * 12) WAP to find word is palindrome or not ? a. String name = “naman” i. Naman is palindrome b. String name = “harsh” i. Harsh is not palindrome 
 */

package krantikhair.assignment3;

public class Question12 {

	static void Pal(String b) {
		String reverse = "";
		for (int i = b.length() - 1; i >= 0; i--) {

			reverse = reverse + b.charAt(i);

		}
		if (b.equals(reverse)) {
			System.out.println(b + " is a palindrome");
		} else {
			System.out.println(b + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		String b = "Kranti";
		Pal(b);

	}

}
