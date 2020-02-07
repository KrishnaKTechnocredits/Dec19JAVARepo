/* 8.	Write a Java program that keeps a number from the user and 
 * generates an integer between 1 and 7 and displays the name of the weekday. 
 * (use switchcase) */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution8 {

	void findDays(int num) {
		switch ("3") {
		case "1":
			System.out.println("Sunday");
			break;
		case "2":
			System.out.println("Monday");
			break;
		case "3":
			System.out.println("Tuesday");
			break;
		case "4":
			System.out.println("Wednesday");
			break;
		case "5":
			System.out.println("Thursday");
			break;
		case "6":
			System.out.println("Friday");
			break;
		case "7":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Entered Number is out of range");
		}

	}

	public static void main(String[] args) {
		Solution8 solution8 = new Solution8();
		System.out.println("Enter number from 1 to 7");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		solution8.findDays(num);
	}

}
