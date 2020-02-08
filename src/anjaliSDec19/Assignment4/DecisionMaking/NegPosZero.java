/*
 * 4.	Find whether a number is negative positive orzero
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class NegPosZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = Integer.parseInt(scan.nextLine());
		if(a==0)
			System.out.println("Entered number is Zero");
		else if (a>0)
			System.out.println("Entered number is Positive");
		else
			System.out.println("Entered number is Negative");
		scan.close();
	}
}
