package aparnaVDec19.assignment3;

/*
 * 11) WAP to find to number is palindrome or not.
       Note:- Palindrome means given word/number is same to read from forward and backward
       i.e. actual number :- 12321
       reverse of actual number :- 12321
 */
import java.util.Scanner;

public class PalindromNumber {
	public int numberIsPalindromeOrNot(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10;
			reverse = reverse + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		PalindromNumber obj1 = new PalindromNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		int reverse = obj1.numberIsPalindromeOrNot(num);
		if (num == reverse)
			System.out.println("Given Number is Palindrome");
		else
			System.out.println("Given Number is not Palindrome");
		scan.close();
	}

}
