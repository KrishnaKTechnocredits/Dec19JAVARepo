/*
 * 3.	Find whether a number is odd or evennumber
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = Integer.parseInt(scan.nextLine());
		if(a%2==0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
		scan.close();
	}
}
