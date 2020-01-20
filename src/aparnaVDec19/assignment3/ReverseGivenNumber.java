package aparnaVDec19.assignment3;

/*
 * 5) WAP to reveres user given number
      a. Input number:- 456789
      b. Output number :- 987654
 */
import java.util.Scanner;

public class ReverseGivenNumber {

	static void reverseNumber(int number) {
		int reverse_num = 0;
		while (number > 0) {
			reverse_num = reverse_num * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Given Number is reversed as:-> " + reverse_num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number = sc.nextInt();
		reverseNumber(number);
		sc.close();

		// if we don't put input from console then we have to write like this
		// way mentioned below:->
		// int number=123;
		// System.out.println("Given Input Number is:-> " + number);
		// reverseNumber(number);

	}

}
