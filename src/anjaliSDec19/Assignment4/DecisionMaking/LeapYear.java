/*
 * 6.	Write a Java program that takes a year from user and print whether that year is a leap year ornot
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year : ");
		int a = Integer.parseInt(scan.nextLine());
		
		boolean flag = false;
        if(a % 4 == 0)
        {
            if( a % 100 == 0)
            {
                if ( a % 400 == 0)
                    flag = true;
                else
                	flag = false;
            }
            else
                flag = true;
        }
        else
            flag = false;
        
        if(flag)
        	System.out.println("Entered year is a Leap year!!");
        else
        	System.out.println("Entered year is not a Leap year!!");
		scan.close();
	}

}
