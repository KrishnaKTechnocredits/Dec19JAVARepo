package aparnaVDec19.assignment4_basicPrograms;

/* 6.	Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 */
import java.util.Scanner;

public class FarenheitToCelsiusNCelciusToFarenheit {
	public double farenheitToCelcius(double farenheit) {
		double celcius = (farenheit - 32) * 5 / 9;// converted Farenheit to
													// Celcius
		return celcius;
	}

	public double celciusToFarenheit(double celcius) {
		double farenheit = ((9 * celcius) / 5) + 32;// converted Celcius to
													// Farenheit
		return farenheit;
	}

	public static void main(String[] args) {
		FarenheitToCelsiusNCelciusToFarenheit fToc_N_cTof = new FarenheitToCelsiusNCelciusToFarenheit();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a value in Fahrenheit: ");
		double celcius = sc.nextDouble();

		System.out.print("Input a value in Celcius: ");
		double farenheit = sc.nextDouble();

		sc.close();
		System.out.println(
				"Given Farenheit degree is converted to celcius as:-> " + fToc_N_cTof.farenheitToCelcius(celcius));
		System.out.println(
				"Given Celcius value is converted to Farenheit as:-> " + fToc_N_cTof.celciusToFarenheit(farenheit));

	}
}
