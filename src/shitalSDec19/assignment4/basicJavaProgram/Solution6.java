/* 6.	Write a Java program to convert temperature from Fahrenheit to Celsius degree */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution6 {
	static double convertTemperature(double temp) {
		return ((temp - 32) * 5) / 9;
	}

	public static void main(String[] args) {
		System.out.println("Enter temperature in Farenheit");
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		System.out.println("Temperature in celsius is " + convertTemperature(temp));
	}

}
