package pravinSDec19.assignment3;

/*
 *  * Created by : Pravin Sarda
 * Assignment 3 : Question 12
	WAP to find word is palindrome or not ?
	a. String name = “naman”
	i. Naman is palindrome
	b. String name = “harsh”
	i. Harsh is not palindrome
 * 
 * 
 */
public class Question12 {

	void checkStringIsPalindrome(String str) {

		String revStr = "";

		for (int j = str.length() - 1; j >= 0; j--) {

			revStr = revStr + str.charAt(j);

		}

		if (str.compareTo(revStr) == 0)
			System.out.println("Given number is palindrome " + revStr);
		else
			System.out.println("Given number is not a palindrome " + revStr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question12 q12 = new Question12();
		String str = "harsh";
		q12.checkStringIsPalindrome(str);

	}

}
