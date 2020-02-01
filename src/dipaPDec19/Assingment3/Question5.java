package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to reveres user given number
	a. Input number:- 456789
	b. Output number :- 987654
 */
public class Question5 {
	public static void main(String[] args) {

		Question5 que5 = new Question5();
		System.out.println("Enter the number you want to reveres");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();

		que5.getReveresNumber(number);
	}

	void getReveresNumber(int num) {
		int reverse = 0;
		while (num != 0) // Logic to find out the reverse number
		{
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse number is : " + reverse);
	}
}
