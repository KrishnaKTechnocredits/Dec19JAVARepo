package kedarKDec19.Assignment3;

public class Question11 {

	static void palindrome(int a) {
		
		int num = a;
		int remainder = 0;
		int reverseNum = 0;

		// revering number given by user
		while (num != 0) {

			remainder = num % 10;
			reverseNum = (reverseNum * 10) + remainder;
			num = num / 10;
		}
		if (a == reverseNum)
			System.out.println("Given number " + a + " is a Palindrome Number");
		else
			System.out.println("Given number " + a + " is not a Palindrome Number");

	}

		
	
	
	
	
	
	public static void main(String[] args) {
		int a=12344321;
		palindrome(a);
	}
}
