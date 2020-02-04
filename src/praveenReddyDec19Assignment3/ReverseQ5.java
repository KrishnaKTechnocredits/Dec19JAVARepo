package praveenReddyDec19Assignment3;
/*
 WAP to reveres user given number 
 a. Input number:- 456789 
 b. Output number :- 987654 
 */

public class ReverseQ5 {
	static void ReverseOfNumber(int input) {
		int digit = 0;
		int sum = 0;
		while (input > 0) {
			// int temp=input;
			digit = input % 10;
			input = input / 10;
			sum = sum * 10 + digit;
		}
		System.out.println("Reverse of given number: " + sum);
	}

	public static void main(String[] args) {
		int input = 456789;
		ReverseQ5.ReverseOfNumber(input);
	}
}
