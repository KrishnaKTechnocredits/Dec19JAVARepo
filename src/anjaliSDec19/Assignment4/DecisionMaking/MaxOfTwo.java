/*1.	Find the maximum of twonumbers.
 * 
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter 2nd Number : ");
		int b = Integer.parseInt(scan.nextLine());
		if(a>b)
			System.out.println("Max of "+a+ " and "+b+" is "+a);
		else 
			System.out.println("Max of "+a+ " and "+b+" is "+b);
		scan.close();
	}
}
