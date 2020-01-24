package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*7) WAP to find Factorial series for user defined number a. Input number :- 5 b. Output :- 120 */

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int num = sc.nextInt();
		findfact(num);
	}

	private static void findfact(int num) {
		int temp = 1;
		for (int i = 1; i <= num; i++) {
			temp = temp * i;
		}
		System.out.println("Factorial of number " + num + " is: " + temp);
	}

}
