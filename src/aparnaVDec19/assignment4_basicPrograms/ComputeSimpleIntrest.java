package aparnaVDec19.assignment4_basicPrograms;

/* 5.	Write a Java program to compute simple Interest.
 */
import java.util.Scanner;

public class ComputeSimpleIntrest {

	public float simpleIntrestCalculation(int principleAmount, int timePeriod, double d) {
		float simpleIntrest = (float) (principleAmount * timePeriod * d / 100);
		return simpleIntrest;
	}

	public static void main(String[] args) {
		ComputeSimpleIntrest simpleIntrest = new ComputeSimpleIntrest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount:-> ");
		int principleAmount = sc.nextInt();
		System.out.println("Enter Time Period:-> ");
		int time = sc.nextInt();
		;
		System.out.println("Enter Rate Of Intrest:-> ");
		float rateOfIntrest = sc.nextFloat();
		sc.close();
		System.out.println("Simple Intrest Calculated as:-> "
				+ (simpleIntrest.simpleIntrestCalculation(principleAmount, time, rateOfIntrest)));

	}
}
