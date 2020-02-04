/*
 * 6.	Write a Java program to convert temperature from Fahrenheit to Celsiusdegree.
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit : ");
		float ftemp = scan.nextFloat();
		float ctemp = ((ftemp-32)*5/9);
		System.out.println("The temperature in Celsius is :"+ctemp);
		scan.close();
	}
}
