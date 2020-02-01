package rohiniBDec19.RohiniAssignment3;

/*11) WAP to find to number is palindrome or not. Note:- Palindrome means 
 * given word/number is same to read from forward and backward 
 * i.e. actual number :- 12321 reverse  of actual number :- 12321 */

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = Integer.parseInt((sc.nextLine()));
		Program11 prg = new Program11();
		int reverse = prg.reverseNum(num);

		if (reverse == num)
			System.out.println("Number is palindrom");
		else
			System.out.println("Number is not palindrom");
	}

	int reverseNum(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		return reversed;
	}
}
