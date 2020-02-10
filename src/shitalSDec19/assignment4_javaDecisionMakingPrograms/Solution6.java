// 6.	Write a Java program that takes a year from user and 
//print whether that year is a leap year or not


package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution6 {
	
	void findLeapYear(int year)
	{
		if (year%4==0 && year%400==0)
			System.out.println("Entered year "+year+" is Leap Year");
		else
			System.out.println("Entered year "+year+" is Not Leap Year");
	}
	
	public static void main(String[] args) {
		Solution6 solution6 = new Solution6();
		System.out.println("Enter 4 numeric digits of year");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		solution6.findLeapYear(y);
	}

}
