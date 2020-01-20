package aparnaVDec19.assignment3;

/*
 * 4) WAP to find sum of user given number.
      a. Input:- 159753
      b. Sum of given number:- 30
 */
import java.util.Scanner;

public class SumOfUserGivenNumber {

	static void sumUserNumber(int number) {
		int sum = 0;
		int reminder;
		while (number > 0) {
			reminder = number % 10;
			sum = sum + reminder;
			number = number / 10;
		}
		System.out.println("Sum of the User Given Number is:-> " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number = sc.nextInt();
		sumUserNumber(number);
		sc.close();

		// if we don't put input from console then we have to write like this
		// way mentioned below:->
		// int number=123;
		// System.out.println("Sum of the User Given Number is:-> " + number);
		// sumUserNumber(number);
	}

}
