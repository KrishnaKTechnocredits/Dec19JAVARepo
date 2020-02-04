/*
 * 5.	Write a Java program to compute simpleinterest
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class SimpleInterest {

	float simpleInt(int p,int n,float r)
	{
		return (p*n*r)/100;
	}
	public static void main(String[] args) {
		SimpleInterest si = new SimpleInterest();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		int p = scan.nextInt();
		System.out.println("Enter the number of days :");
		int n = scan.nextInt();
		System.out.println("Enter the Rate of Interest :");
		float r = scan.nextFloat();
		System.out.println("Simple interest is :"+si.simpleInt(p, n, r));
		scan.close();
	}
}
