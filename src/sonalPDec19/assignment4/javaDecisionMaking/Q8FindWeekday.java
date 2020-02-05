package sonalPDec19.assignment4.javaDecisionMaking;

import java.util.Scanner;
/*
8.	Write a Java program that keeps a number from the user and generates
 an integer between 1 and 7 and displays the name of the weekday. (use switchcase)
*/

public class Q8FindWeekday {

	static void findDayOfWeek(int day) {
		switch (day) {
		case 1:
			System.out.println("It's Monday");
			break;
		case 2:
			System.out.println("It's Tuesday.");
			break;
		case 3:
			System.out.println("It's Wednesday.");
			break;
		case 4:
			System.out.println("It's Thursday.");
			break;
		case 5:
			System.out.println("It's Friday.");
			break;
		case 6:
			System.out.println("It's Saturday.");
			break;
		case 7:
			System.out.println("It's Sunday.");
			break;
		default:
			System.out.println("Please enter correct input. Expected number is between 1 to 7.");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day number in the week: ");
		int d = s.nextInt();
		findDayOfWeek(d);
	}
}
