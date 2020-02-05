//6.Write a Java program that takes a year from user and print whether that year is a leap year ornot
//  check if year is divisible by 4 but not 100 also checkyear is divisible by 40022

package vaishg10695.Assignment4;

import java.util.Scanner;

public class DecisionMakingProgQ6 {
	
	void leapYear(int year)
	{
		if (((year%4==0) && (year % 100!=0))||(year%400==0))
			System.out.println("Enter year is leap year");
		else
			System.out.println("Enter year is not leap year");

			
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		
		DecisionMakingProgQ6 q6=new DecisionMakingProgQ6();
		q6.leapYear(year);

	}

}
