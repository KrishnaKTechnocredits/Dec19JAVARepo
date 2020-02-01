package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 *WAP to find number is Armstrong or not.
	a. Int number = 153
	i. Number is Armstrong
	b. Int number = 234
	i. Number is not Armstrong 
 */
public class Question13 {
	public static void main(String[] args) {
		Question13 que13 = new Question13();

		System.out.println("Enter Number");
		int num = new Scanner(System.in).nextInt();

		que13.findArmstrong(num);
	}

	void findArmstrong(int num) {

		int rem, temp, sum = 0;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}

		if (temp == sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not a Armstrong");
	}
}
