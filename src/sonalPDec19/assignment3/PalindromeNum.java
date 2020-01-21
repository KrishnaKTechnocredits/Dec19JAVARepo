package sonalPDec19.assignment3;
/*
 * WAP to find number is palindrome or not?
 */
import java.util.Scanner;

public class PalindromeNum {

	void findPalindromeNumber(String inputNum) {
		String revNum = "";
		for (int i = inputNum.length() - 1; i >= 0; i--) {
			revNum = revNum + inputNum.charAt(i);
		}

		System.out.println("Reverse Number: " + revNum);

		if (inputNum.compareTo(revNum) == 0)
			System.out.println("Given number is Palindrome.");
		else
			System.out.println("Given number is not Palindrome.");
	}

	public static void main(String[] args) {
		PalindromeNum palindromeNum = new PalindromeNum();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		String inputNum = s.nextLine();
		palindromeNum.findPalindromeNumber(inputNum);
	}
}
