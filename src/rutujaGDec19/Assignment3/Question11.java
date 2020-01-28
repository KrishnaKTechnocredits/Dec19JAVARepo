package rutujaGDec19.Assignment3;
/*Palindrome for string and number ie Q11 and Q12*/
import java.util.Scanner;
public class Question11 {
	static void checkPalindrome(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
		      reverse = reverse + s.charAt(i);
		}
		     if (s.equals(reverse))
		      System.out.println("The string is a palindrome.");
		    else
		      System.out.println("The string is not a palindrome.");
	}
	public static void main(String[] args) {
		String s = ""; 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string : ");
	    s = in.nextLine();
        checkPalindrome(s);
	}
}
