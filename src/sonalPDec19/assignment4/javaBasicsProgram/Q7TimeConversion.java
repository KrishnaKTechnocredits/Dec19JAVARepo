package sonalPDec19.assignment4.javaBasicsProgram;
/*
 * 7.	Write a Java program to convert seconds to hour, minute and seconds.
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q7TimeConversion {

	static void convertTime(double timeInSec) {
		double timeInHr = 0;
		double timeInMinute = 0;
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

		timeInHr = timeInSec / 3600;
		timeInMinute = timeInSec / 60;
		System.out.println("Time in hr: " + df.format(timeInHr));
		System.out.println("Time in minute: " + df.format(timeInMinute));
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter time in second: ");
		double time = t.nextDouble();
		convertTime(time);
	}
}
