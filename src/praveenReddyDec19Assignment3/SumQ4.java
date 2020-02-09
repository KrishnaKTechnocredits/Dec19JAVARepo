package praveenReddyDec19Assignment3;
/*
 WAP to find sum of user given number. 
 a. Input:- 159753 
 b. Sum of given number:- 30 
 */

public class SumQ4 {
	static void SumOfNumber(int input) {
		int sum = 0;

		while (input > 0) {
			int r = input % 10;
			sum = sum + r;
			input = input / 10;
		}
		System.out.println("Sum of given number is: " + sum);
	}

	public static void main(String[] args) {
		int input = 159753;
		SumQ4.SumOfNumber(input);
	}
}
