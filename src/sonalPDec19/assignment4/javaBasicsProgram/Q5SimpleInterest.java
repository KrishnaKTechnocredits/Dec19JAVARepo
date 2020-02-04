package sonalPDec19.assignment4.javaBasicsProgram;

import java.util.Scanner;

/*
 * Write a Java program to compute simple interest
 */

public class Q5SimpleInterest {

	static void calculateSimpleInterest(double principal, double rateOfInterest, int year) {
		double simpleInterest = (principal * rateOfInterest * year) / 100;
		System.out.println("Simple interest : " + simpleInterest);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter principal : ");
		double p = s.nextDouble();
		System.out.println("Enter rate of interest : ");
		double rateI = s.nextDouble();
		System.out.println("Enter no of years : ");
		int yr = s.nextInt();
		calculateSimpleInterest(p, rateI, yr);
	}
}
