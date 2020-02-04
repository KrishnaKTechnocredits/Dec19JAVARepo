package pravinSDec19.assignment3;

/*
 * Created by : Pravin Sarda
 * Assignment 3 : Question 11
	WAP to find to number is palindrome or not.
	Note:- Palindrome means given word/number is same to read from forward and backward
	i.e. actual number :- 12321
	reverse of actual number :- 12321
 * 
 * 
 * 
 */
public class Question11 {

	// checkNumIsPalindrome method is used to check whether given number palindrome
	// is or not.
	static void checkNumIsPalindrome(int num) {

		int revNum = 0;
		int temp = 0;
		int orgNum = num;

		while (num != 0) {

			temp = num % 10;

			revNum = revNum * 10 + temp;

			num = num / 10;

		}

		if (orgNum == revNum)
			System.out.println("Given number is palindrome " + revNum);
		else
			System.out.println("Given number is not a palindrome " + revNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123241;
		checkNumIsPalindrome(num);

	}
}