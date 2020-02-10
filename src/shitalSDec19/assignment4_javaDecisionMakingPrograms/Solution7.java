//7.	Write a Java Program and create Calculator using switch statement

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution7 {
	int sum;

	void createCalculator(int a, int b) {
		double add;

		switch ("multiply") {
		case "sum":
			System.out.println(doSum(a, b));
			break;
		case "substract":
			System.out.println(doMinus(a, b));
			break;
		case "multiply":
			System.out.println(multiply(a, b));
			break;
		case "division":
			System.out.println(division(a, b));
			break;
		default:
			System.out.println("None of the cases matched");
		}

	}

	int doSum(int a, int b) {
		return a + b;
	}

	int doMinus(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Solution7 solution7 = new Solution7();
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		solution7.createCalculator(a, b);
	}

}
