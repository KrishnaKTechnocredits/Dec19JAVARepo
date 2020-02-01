package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*13) WAP to find number is Armstrong or not. 
 * a. Int number = 153 i. Number is Armstrong 
 * b. Int number = 234 i. Number is not Armstrong */

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for summation");
		int num = sc.nextInt();
		Program13 prg = new Program13();
		int length = (String.valueOf(num)).length();
		prg.findArmstrong(num, length);
	}

	private void findArmstrong(int num, int length) {
		int originalNumber, digit, num1 = 0;
		originalNumber = num;
		while (originalNumber != 0) {
			digit = originalNumber % 10;
			num1 += Math.pow(digit, length);
			originalNumber /= 10;
		}
		if (num1 == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}
}
