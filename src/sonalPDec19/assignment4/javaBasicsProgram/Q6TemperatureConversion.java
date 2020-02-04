package sonalPDec19.assignment4.javaBasicsProgram;
/*
 * 6.	Write a Java program to convert temperature from Fahrenheit to Celsiusdegree.
 */

public class Q6TemperatureConversion {
	static void convertTemperature(float temp) {

		float tempInCelsius = (temp - 32) * 5 / 9;
		System.out.println("Temperature in Celeisus degree: " + tempInCelsius);

	}

	public static void main(String[] args) {
		convertTemperature(3);
	}
}
