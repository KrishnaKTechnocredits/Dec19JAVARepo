/*
 * 8.	Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. (use switchcase)
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class DaysOfWeek {
	
	void day(int num)
	{
		switch(num)
		{
		case 1:
			System.out.println("The day is Monday");
			break;
		case 2:
			System.out.println("The day is Tuesday");
			break;
		case 3:
			System.out.println("The day is Wednesday");
			break;
		case 4:
			System.out.println("The day is Thrusday");
			break;
		case 5:
			System.out.println("The day is Friday");
			break;
		case 6:
			System.out.println("The day is Saturday");
			break;
		case 7:
			System.out.println("The day is Sunday");
			break;
		default :
			System.out.println("Entered number is not between 1 to 7");
		}
	}

	public static void main(String[] args) {
		DaysOfWeek obj = new DaysOfWeek();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7");
		int num = Integer.parseInt(scan.nextLine());
		obj.day(num);
		scan.close();
	}
}
