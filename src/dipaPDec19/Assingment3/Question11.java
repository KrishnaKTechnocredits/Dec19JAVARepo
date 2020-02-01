package dipaPDec19.Assingment3;

/*
 * WAP to find to number is palindrome or not.
	Note:- Palindrome means given word/number is same to read from forward and
	backward
	i.e. actual number :- 12321
	reverse of actual number :- 12321
 */
public class Question11 {
	public static void main(String[] args) {
		Question11 que11 = new Question11();
		int number = 12321;
		que11.gerPalindromeNum(number);
	}

	void gerPalindromeNum(int num) {
		int rem, temp, sum = 0;
		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		if (temp == sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");

	}
}
